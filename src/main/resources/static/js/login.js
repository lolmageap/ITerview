const loginEmail = document.getElementById('loginId');
const loginPassword = document.getElementById('loginPassword');

const signupEmail = document.getElementById('signupId');
const signupPassword = document.getElementById('signupPassword');
const signupPasswordConfirm = document.getElementById('confirmPassword');


const login = async () => {
    if (!loginEmail.value || !loginPassword.value) {
        alert("모든 필수 항목을 입력해주세요.")
        return;
    }

    const response = await fetch("/authorities/sign-in", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify({'email': loginEmail.value, 'password': loginPassword.value})
    })

    await setCookie(response)
}

const signup = async () => {
    if (!signupEmail.value || !signupPassword.value || !signupPasswordConfirm.value) {
        alert("모든 필수 항목을 입력해주세요.");
        return;
    }

    const signupButton = document.getElementById('signup-button')
    signupButton.onclick = null

    try {
        const response = await fetch("/authorities/sign-up", {
            method: "POST",
            headers: {"Content-Type": "application/json"},
            body: JSON.stringify({
                'email': signupEmail.value,
                'password': signupPassword.value,
                'confirmPassword': signupPasswordConfirm.value
            })
        })

        await setCookie(response)
    } catch (error) {
        console.error("Error during signup:", error)
    } finally {
        setTimeout(() => {
            signupButton.onclick = signup
        }, 2000)
    }
}

const setCookie = async response => {
    if (response.status == 201) {
        const authorization = response.headers.get("Authorization")
        if (authorization) {
            document.cookie = `Authorization=${authorization}; path=/`
            location.href = '/'
        } else {
            console.error("Authorization 헤더가 응답에 없습니다. 로그인에 실패했을 수 있습니다.")
        }
    } else {
        let data = await response.json()
        alert(data.message)
    }
}

const check = () => {
    const checkbox = document.getElementById('reg-log')
    checkbox.checked = true
}

const uncheck = () => {
    const checkbox = document.getElementById('reg-log')
    checkbox.checked = false
}

const loginHandle = async event => {
    if (event.keyCode === 13) {
        await login();
    }
}

const signupHandle = async event => {
    if (event.keyCode === 13) {
        await signup();
    }
}

loginEmail.addEventListener('keypress', loginHandle);
loginPassword.addEventListener('keypress', loginHandle);

signupEmail.addEventListener('keypress', signupHandle);
signupPassword.addEventListener('keypress', signupHandle);
signupPasswordConfirm.addEventListener('keypress', signupHandle);
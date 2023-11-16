const login = async () => {
    const email = document.getElementById('loginId').value
    const password = document.getElementById('loginPassword').value

    if (!email || !password) {
        alert("모든 필수 항목을 입력해주세요.");
        return;
    }

    const response = await fetch("/authority/sign-in", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify({'email': email, 'password': password})
    });

    await setCookie(response);
}

const signup = async () => {
    const email = document.getElementById('signupId').value
    const password = document.getElementById('signupPassword').value
    const confirmPassword = document.getElementById('confirmPassword').value

    if (!email || !password || !confirmPassword) {
        alert("모든 필수 항목을 입력해주세요.");
        return;
    }

    const response = await fetch("/authority/sign-up", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify({'email': email, 'password': password, 'confirmPassword': confirmPassword})
    });

    await setCookie(response);
}

const setCookie = async response => {
    if (response.status == 201) {
        const authorization = response.headers.get("Authorization")
        if (authorization) {
            document.cookie = `Authorization=${authorization}; path=/`;
            location.href = '/'
        } else {
            console.error("Authorization 헤더가 응답에 없습니다. 로그인에 실패했을 수 있습니다.");
        }
    } else {
        let data = await response.json();
        alert(data.message)
    }
}

const check = () => {
    const checkbox = document.getElementById('reg-log');
    checkbox.checked = true;
}

const uncheck = () => {
    const checkbox = document.getElementById('reg-log');
    checkbox.checked = false;
}
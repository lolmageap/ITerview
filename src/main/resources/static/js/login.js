const login = async () => {
    const email = document.getElementById('loginId').value
    const password = document.getElementById('loginPassword').value

    const response = await fetch("/authority/sign-in", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify({'email': email, 'password': password})
    });

    const authorization = response.headers.get("Authorization")

    if (authorization) {
        document.cookie = `Authorization=${authorization}; path=/`;
    } else {
        console.error("Authorization 헤더가 응답에 없습니다. 로그인에 실패했을 수 있습니다.");
    }
}

const signup = async () => {
    const email = document.getElementById('signupId').value
    const password = document.getElementById('signupPassword').value
    const confirmPassword = document.getElementById('confirmPassword').value
    const response = await fetch("/authority/sign-up", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify({'email': email, 'password': password, 'confirmPassword': confirmPassword})
    });
}
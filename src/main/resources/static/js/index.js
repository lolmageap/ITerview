const getCookie = () => {
    const authorization = document.cookie.replace(/(?:(?:^|.*;\s*)Authorization\s*=\s*([^;]*).*$)|^.*$/, "$1")
    return authorization
}
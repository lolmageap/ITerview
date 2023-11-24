const getCookie = () => {
    const authorization = document.cookie.replace(/(?:(?:^|.*;\s*)Authorization\s*=\s*([^;]*).*$)|^.*$/, "$1")
    return authorization
}

const clearCookie = () => {
    document.cookie = 'Authorization=; expires=Thu, 01 Jan 1970 00:00:00 UTC; path=/;'
}
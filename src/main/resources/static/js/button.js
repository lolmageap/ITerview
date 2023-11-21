const handleSubmit = async () => {
    const inputField = document.getElementById('inputField')
    const submitBtn = document.getElementById('submitBtn')
    const sendBtn = document.getElementById('sendBtn')

    if (inputField.value.trim() !== '') {
        inputField.style.display = 'none'
        submitBtn.style.display = 'none'

        sendBtn.style.display = 'inline-block'
    }
}

const handleSend = async () => {
    const inputField = document.getElementById('inputField')
    const submitBtn = document.getElementById('submitBtn')
    const sendBtn = document.getElementById('sendBtn')

    sendBtn.style.display = 'none'

    inputField.style.display = 'inline-block'
    submitBtn.style.display = 'inline-block'

    inputField.value = ''
    const questions = makeRequestParams(questionTypes, "questionTypes")
    const programing = makeRequestParams(programingTypes, "programingTypes")
    const frameworks = makeRequestParams(frameworkTypes, "frameworkTypes")
    const level = makeRequestParams(levels, "levels")

    const queryParams = [questions, programing, frameworks, level]
        .map(param => param === '' ? param : param + '&')
        .join('')
        .slice(0, -1)

    if (getCookie() !== '') {
        const url = "/question" + (queryParams !== '' ? '?' + queryParams : '')

        const response = await fetch(url, {
            method: "GET",
            headers: {
                "Content-Type": "application/json",
                "Authorization": getCookie()
            },
        })

        const json = await response.json()
        console.log(json)
        if (response.status == 403 || response.status == 401) {
            location.href = '/login'
        }
    } else {
        location.href = '/login'
    }
}

let questionToken;

const handleSubmit = async () => {
    const inputField = document.getElementById('inputField')
    const submitBtn = document.getElementById('submitBtn')
    const sendBtn = document.getElementById('sendBtn')

    if (inputField.value.trim() !== '') {
        if (getCookie() !== '') {
            inputField.style.display = 'none'
            submitBtn.style.display = 'none'
            sendBtn.style.display = 'inline-block'

            createAnimatedMessage(inputField.value, "answer")

            const response = await fetch("/answer", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json",
                    "Authorization": getCookie()
                },
                body: JSON.stringify({
                    questionToken: questionToken,
                    answer: inputField.value
                })
            })

            const json = await response.json()
            const {score, feedback} = json
            const feedbackText = `${score}점
            ${feedback}`
            createAnimatedMessage(feedbackText, "feedback")
        } else {
            location.href = '/login'
        }
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
        createAnimatedMessage(json.title, "question")
        questionToken = json.token
        if (response.status == 403 || response.status == 401) {
            location.href = '/login'
        }
    } else {
        location.href = '/login'
    }
}

const createAnimatedMessage = (text, type) => {
    const messageContainer = document.createElement("div")
    messageContainer.classList.add("message")

    const contentContainer = document.createElement("div")
    contentContainer.classList.add(type)

    const header = document.createElement("h4")
    header.textContent = type.charAt(0).toUpperCase() + type.slice(1)

    const animationTarget = document.createElement("div")
    animationTarget.textContent = text
    animationTarget.id = "animationTarget"

    contentContainer.appendChild(header)
    contentContainer.appendChild(animationTarget)
    messageContainer.appendChild(contentContainer)

    document.querySelector(".chat-container").appendChild(messageContainer)

    let currentIndex = 0
    const animationInterval = setInterval(() => {
        animationTarget.textContent = text.slice(0, currentIndex)
        currentIndex++

        if (currentIndex > text.length) {
            clearInterval(animationInterval)
        }
    }, 20)
}

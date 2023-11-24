let questionToken;
const inputField = document.getElementById('inputField')
const submitBtn = document.getElementById('submitBtn')
const sendBtn = document.getElementById('sendBtn')
const next = document.getElementById('next')

const handleSubmit = async () => {

    if (inputField.value.trim() !== '') {
        if (getCookie() !== '') {
            inputField.style.display = 'none'
            submitBtn.style.display = 'none'
            sendBtn.style.display = 'inline-block'
            next.style.display = 'none'

            await createAnimatedMessage(inputField.value, "answer")
            await disableButton('sendBtn')

            const response = await fetch("/answers", {
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
            await enableButton('sendBtn', 'handleSend()')

            const data = await response.json()
            const {score, feedback} = data
            const feedbackText = `${score}점, ${feedback}`
            await createAnimatedMessage(feedbackText, "feedback")
        } else {
            location.href = '/login'
        }
    }
}

const handleSend = async () => {
    sendBtn.style.display = 'none'
    inputField.style.display = 'inline-block'
    submitBtn.style.display = 'inline-block'
    next.style.display = 'inline-block'

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
        const url = "/questions" + (queryParams !== '' ? '?' + queryParams : '')
        const response = await fetch(url, {
            method: "GET",
            headers: {
                "Content-Type": "application/json",
                "Authorization": getCookie()
            },
        })

        const data = await response.json()
        if (response.status == 403 || response.status == 401) {
            location.href = '/login'
        } else if (response.status === 404) {
            await hasNotQuestions(data.message)
            return;
        }

        await disableButton('submitBtn')
        await createAnimatedMessage(data.title, "question")
        await enableButton('submitBtn', 'handleSubmit()')
        questionToken = data.token
    } else {
        location.href = '/login'
    }
}

const createAnimatedMessage = async (text, type) => {
    const messageContainer = document.createElement("div")
    messageContainer.classList.add("message")

    const contentContainer = document.createElement("div")
    contentContainer.classList.add(type)

    const header = document.createElement("h4")
    header.textContent = type.charAt(0).toUpperCase() + type.slice(1)

    const animationTarget = document.createElement("div")
    animationTarget.innerHTML = text
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
            afterChatFunction()
        }
    }, 20)
}


const afterChatFunction = async () => {
    const chatContainer = document.querySelector('.chat-container');
    const lastMessage = chatContainer.lastElementChild;
    lastMessage.scrollIntoView({ behavior: 'smooth', block: 'end' });
}

const disableButton = async btn => {
    const submitBtn = document.getElementById(btn);
    if (submitBtn) {
        submitBtn.disabled = true;
        submitBtn.removeAttribute('onclick');
    }
}

const enableButton = async (btn, fun) => {
    const submitBtn = document.getElementById(btn);
    if (submitBtn) {
        submitBtn.disabled = false;
        submitBtn.setAttribute('onclick', fun);
    }
}

const hasNotQuestions = async message => {
    inputField.style.display = 'none'
    submitBtn.style.display = 'none'
    sendBtn.style.display = 'inline-block'
    next.style.display = 'none'

    await createAnimatedMessage(message, "feedback")
}
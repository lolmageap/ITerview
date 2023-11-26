let questionToken;
let questionTitle;
const inputField = document.getElementById('inputField')
const submitBtn = document.getElementById('submitBtn')
const sendBtn = document.getElementById('sendBtn')
const next = document.getElementById('next')
const loading = document.getElementById('loading-container')
let debounceTimer = null

const checkNestedRequest = () => {
    if (debounceTimer !== null) {
        return true
    }

    debounceTimer = setTimeout(() => {
        debounceTimer = null
    }, 1000)

    return false
}

const handleSubmit = async () => {
    if (checkNestedRequest()) {
        return
    }

    if (getCookie() === '') {
        location.href = '/login'
    }

    const boolean = inputField.value.includes("정답을 가르쳐줘")

    if (inputField.value.trim() === '' || boolean) {
        const confirms = confirm('답을 입력하지 않았습니다. 정답을 확인 하시겠습니까?')

        if (confirms) {
            loading.style.display = 'block'
            hideAnswerField()
            await createAnimatedMessage("정답을 가르쳐줘", "answer")
            await disableButton('sendBtn')

            const response = await fetch("/answers/" + questionToken, {
                method: "GET",
                headers: {
                    "Content-Type": "application/json",
                    "Authorization": getCookie()
                }
            })
            await enableButton('sendBtn', 'handleSend()')

            const data = await response.json()
            const {answer} = JSON.parse(data.body)

            const historyToken = data.token
            addHistory( {question: questionTitle, token: historyToken} )
            await createAnimatedMessage(answer, "feedback", enableButton.bind(null, 'submitBtn', handleSubmit))
        } else {
            return
        }
    } else {
        loading.style.display = 'block'
        hideAnswerField()
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

        const {score, feedback} = JSON.parse(data.body)
        const historyToken = data.token
        const feedbackText = `${score}점, ${feedback}`

        addHistory( {question: questionTitle, token: historyToken} )
        await createAnimatedMessage(feedbackText, "feedback", enableButton.bind(null, 'submitBtn', handleSubmit))
    }

    loading.style.display = 'none'
}

const handleSend = async () => {
    checkNestedRequest()
    hideQuestionField()
    removeIntroduce()

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
        questionTitle = data.title
    } else {
        location.href = '/login'
    }
}

const createAnimatedMessage = async (text, type, callback) => {
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
            if (callback) {
                callback()
            }
        }
    }, 20)
}


const afterChatFunction = async () => {
    const chatContainer = document.querySelector('.chat-container')
    const lastMessage = chatContainer.lastElementChild
    lastMessage.scrollIntoView({behavior: 'smooth', block: 'end'})
}

const disableButton = async btn => {
    const submitBtn = document.getElementById(btn)
    if (submitBtn) {
        submitBtn.disabled = true
        submitBtn.removeAttribute('onclick')
    }
}

const enableButton = async (btn, fun) => {
    const submitBtn = document.getElementById(btn)
    if (submitBtn) {
        submitBtn.disabled = false
        submitBtn.setAttribute('onclick', fun)
    }
}

const hideAnswerField = () => {
    inputField.style.display = 'none'
    submitBtn.style.display = 'none'
    sendBtn.style.display = 'inline-block'
    next.style.display = 'none'
}

const hideQuestionField = () => {
    sendBtn.style.display = 'none'
    inputField.style.display = 'inline-block'
    submitBtn.style.display = 'inline-block'
    next.style.display = 'inline-block'
}

const hasNotQuestions = async message => {
    hideAnswerField()
    await createAnimatedMessage(message, "feedback")
}

const resizeTextarea = () => {
    inputField.style.height = ''
    inputField.style.height = inputField.scrollHeight + 'px'
}

const handleKeyPress = async (event) => {
    if (event.key === 'Enter' && !event.shiftKey) {
        inputField.value = inputField.value.trim()
        await handleSubmit()
    } else if (event.key === 'Enter' && event.shiftKey) {
        const cursorPos = inputField.selectionStart
        const textBeforeCursor = inputField.value.substring(0, cursorPos)
        const textAfterCursor = inputField.value.substring(cursorPos)

        inputField.value = textBeforeCursor + '\n' + textAfterCursor

        resizeTextarea()
        event.preventDefault()
    }
}
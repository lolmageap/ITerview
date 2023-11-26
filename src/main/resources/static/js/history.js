const createHistories = async () => {
    let data = await getHistories()
    data.forEach(item => {
        createHistory(item);
    })
}

const getHistories = async () => {
    const response = await fetch('/answers/histories', {
        method: "GET",
        headers: {
            "Content-Type": "application/json",
            "Authorization": getCookie()
        },
    })

    return await response.json()
}

const getHistory = async token => {
    removeIntroduce()
    hideAnswerField()
    const response = await fetch(`/answers/histories/${token}`, {
        method: "GET",
        headers: {
            "Content-Type": "application/json",
            "Authorization": getCookie()
        },
    })

    const data = await response.json()
    await switchChatContainer(data)
}

const switchChatContainer = async data => {
    document.querySelector('.chat-container').innerHTML = ''
    await createAnimatedMessage(data.question, "question")
    await createAnimatedMessage(data.answer, "answer")

    const {score, feedback, answer} = JSON.parse(data.feedback)
    if (answer) {
        await createAnimatedMessage(answer, "feedback")
    } else {
        const feedbackText = `${score}점, ${feedback}`
        await createAnimatedMessage(feedbackText, "feedback")
    }
}

const addHistory = item => {
    const listItem = document.createElement('li')

    const spanElement = document.createElement('span')
    spanElement.id = item.token
    spanElement.textContent = item.question
    spanElement.onclick = () => getHistory(item.token)

    listItem.appendChild(spanElement)
    historiesElement.insertBefore(listItem, historiesElement.firstChild)
    removeOldestHistory()
}

const createHistory = item => {
    const listItem = document.createElement('li')

    const spanElement = document.createElement('span')
    spanElement.id = item.token
    spanElement.textContent = item.question
    spanElement.onclick = () => getHistory(item.token)

    listItem.appendChild(spanElement)
    historiesElement.appendChild(listItem)
}

const removeOldestHistory = () => {
    const lastListItem = historiesElement.lastElementChild;
    lastListItem.remove();
};

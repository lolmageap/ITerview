const createHistories = async () => {
    let data = await getHistories()

    data.forEach(item => {
        const listItem = document.createElement('li')

        const spanElement = document.createElement('span')
        spanElement.id = item.token
        spanElement.textContent = item.question
        spanElement.onclick = () => getHistory(item.token)

        listItem.appendChild(spanElement)
        historiesElement.appendChild(listItem)
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
    console.log(data)
    document.querySelector('.chat-container').innerHTML = ''
    await createAnimatedMessage(data.question, "question")
    await createAnimatedMessage(data.answer, "answer")
    await createAnimatedMessage(data.feedback, "feedback")
}

document.addEventListener('DOMContentLoaded', () => {
    const checkbox = document.getElementById('checkbox')
    const submit = document.getElementById('position-submit')

    checkbox.addEventListener('change', function () {
        toggleChatContainer(checkbox)
        toggleSubmitContainer(checkbox)
        toggleHistories(checkbox)
        toggleNextButton(checkbox)
    })

    submit.addEventListener('click', function () {
        toggleChatContainer(checkbox)
        toggleSubmitContainer(checkbox)
        toggleHistories(checkbox)
        toggleNextButton(checkbox)
    })
})

const toggleChatContainer = checkbox => {
    const chatContainer = document.querySelector('.chat-container')
    chatContainer.style.transition = 'opacity 0.5s ease-in-out'
    chatContainer.style.opacity = checkbox.checked ? 0 : 1
    chatContainer.style.visibility = checkbox.checked ? 'hidden' : 'visible'

    const transitionEndHandler = () => {
        chatContainer.style.transition = 'none'
        chatContainer.removeEventListener('transitionend', transitionEndHandler)
        chatContainer.style.visibility = checkbox.checked ? 'hidden' : 'visible'
    }

    chatContainer.addEventListener('transitionend', transitionEndHandler)
    chatContainer.offsetHeight
    chatContainer.style.opacity = checkbox.checked ? 0 : 1
}

const toggleSubmitContainer = checkbox => {
    const submitContainer = document.querySelector('.submit-container')
    submitContainer.style.transition = 'opacity 0.5s ease-in-out'
    submitContainer.style.opacity = checkbox.checked ? 0 : 1
    submitContainer.style.visibility = checkbox.checked ? 'hidden' : 'visible'

    const transitionEndHandler = () => {
        submitContainer.style.transition = 'none'
        submitContainer.removeEventListener('transitionend', transitionEndHandler)
        submitContainer.style.visibility = checkbox.checked ? 'hidden' : 'visible'
    }

    submitContainer.addEventListener('transitionend', transitionEndHandler)
    submitContainer.offsetHeight
    submitContainer.style.opacity = checkbox.checked ? 0 : 1
}

const toggleHistories = checkbox => {
    historiesElement.style.display = checkbox.checked ? 'none' : 'block'
}

const toggleNextButton = checkbox => {
    const nextButton = document.getElementById('next')
    nextButton.style.display = checkbox.checked ? 'none' : 'block'
}


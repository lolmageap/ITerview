document.addEventListener('DOMContentLoaded', () => {
    const checkbox = document.getElementById('checkbox')
    const submit = document.getElementById('position-submit')

    checkbox.addEventListener('change', function () {
        toggleChatContainer(checkbox);
    })

    submit.addEventListener('click', function () {
        toggleChatContainer(checkbox)
    })
})

const toggleChatContainer = checkbox => {
    const chatContainer = document.querySelector('.chat-container');

    chatContainer.style.opacity = checkbox.checked ? 0 : 1;
    chatContainer.style.visibility = checkbox.checked ? 'hidden' : 'visible';

    const transitionEndHandler = () => {
        chatContainer.style.transition = 'none';
        chatContainer.removeEventListener('transitionend', transitionEndHandler);

        chatContainer.style.visibility = checkbox.checked ? 'hidden' : 'visible';
    };

    chatContainer.addEventListener('transitionend', transitionEndHandler);

    chatContainer.offsetHeight;

    chatContainer.style.opacity = checkbox.checked ? 0 : 1;
};


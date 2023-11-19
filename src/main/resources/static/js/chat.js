document.addEventListener('DOMContentLoaded', function () {
    const checkbox = document.getElementById('checkbox');
    const chatContainer = document.querySelector('.chat-container');

    checkbox.addEventListener('change', function () {
        chatContainer.style.opacity = checkbox.checked ? 0 : 1;
    });
});
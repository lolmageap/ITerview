const handleSubmit = () => {
    const inputField = document.getElementById('inputField');
    const submitBtn = document.getElementById('submitBtn');
    const sendBtn = document.getElementById('sendBtn');

    if (inputField.value.trim() !== '') {
        inputField.style.display = 'none';
        submitBtn.style.display = 'none';

        sendBtn.style.display = 'inline-block';
    }
}

const handleSend = () => {
    const inputField = document.getElementById('inputField');
    const submitBtn = document.getElementById('submitBtn');
    const sendBtn = document.getElementById('sendBtn');

    sendBtn.style.display = 'none';

    inputField.style.display = 'inline-block';
    submitBtn.style.display = 'inline-block';

    inputField.value = '';
}
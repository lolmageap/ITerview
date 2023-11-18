const positions = new Set()

const closeTab = () => {
    const checkbox = document.getElementById('checkbox')
    if (!checkbox.checked) {
        closePosition()
        closeCategory()
        closePrograming()
        closeFramework()
        document.getElementById('cbx-1').checked = false
        document.getElementById('cbx-14').checked = false
    }
}

const showPositionAndCheck = () => {
    showPosition()
    toggleCheckbox('cbx-1')
}

const showPosition = () => {
    const list = document.getElementById('position-detail')
    if (list.style.display === '' || list.style.display === 'none') {
        list.style.display = 'flex'
    } else {
        closePosition()
    }
}

const closePosition = () => {
    const list = document.getElementById('position-detail')
    list.style.display = 'none'
    uncheckChildren('position-detail')
    positions.clear()
}

const closeCategory = () => {
    const list = document.getElementById('category-detail')
    list.style.display = 'none'
    uncheckChildren('category-detail')
}

const showCategoryAndCheck = () => {
    showCategory()
    toggleCheckbox('cbx-14')
}

const openCategory = () => {
    const list = document.getElementById('category-detail')
    list.style.display = 'inline'
    const checkbox = document.getElementById('cbx-14')
    checkbox.checked = true
}

const showCategory = () => {
    const list = document.getElementById('category-detail')
    if (list.style.display === '' || list.style.display === 'none') {
        list.style.display = 'inline'
    } else {
        closeCategory()
        closePrograming()
        closeFramework()
    }
}

const showProgramingAndCheck = () => {
    showPrograming()
    toggleCheckbox('cbx-22')
}

const showFrameworkAndCheck = () => {
    showFramework()
    toggleCheckbox('cbx-23')
}

const showPrograming = () => {
    const list = document.getElementById('programing-detail')
    if (list.style.display === '' || list.style.display === 'none') {
        list.style.display = 'flex'
    } else {
        uncheckChildren('programing-detail')
    }
}

const closePrograming = () => {
    const list = document.getElementById('programing-detail')
    list.style.display = 'none'
    uncheckChildren('programing-detail')
}

const showFramework = () => {
    const list = document.getElementById('framework-detail')
    if (list.style.display === '' || list.style.display === 'none') {
        list.style.display = 'flex'
    } else {
        uncheckChildren('framework-detail')
    }
}

const closeFramework = () => {
    const list = document.getElementById('framework-detail')
    list.style.display = 'none'
    uncheckChildren('framework-detail')
}

const toggleCheckbox = id => {
    const checkbox = document.getElementById(id)
    checkbox.checked = !checkbox.checked
}

const uncheckChildren = async id => {
    const list = document.getElementById(id)
    Array.from(list.children).forEach(child => {
        const checkbox = child.querySelector('input[type="checkbox"]')
        if (checkbox.checked) {
            checkbox.checked = !checkbox.checked
        }
    });
}

const checkQuestions = id => {
    toggleCheckbox(id)
    addPositionInSet(id)
}

const addPositionInSet = id => {
    const checkbox = document.getElementById(id)
    const type = checkbox.name
    const status = checkbox.checked

    if (status) {
        positions.add(type)
    } else {
        uncheckChildren('category-detail')
        positions.delete(type)
    }

    openCategory()
    showPrograming()
    showFramework()
    sendPositionToServer()
}

const sendPositionToServer = async () => {
    const params = makeRequestParams(positions, 'positionTypes')
    if (!params) {
        return;
    }
    const response = await fetch("/position?" + params, {
        method: "GET",
        headers: {"Content-Type": "application/json"},
    });

    const body = await response.json()
    console.log(body)
    await checkQuestionFromPosition(body)
}

const makeRequestParams = (set, key) => {
    const encodedValues = Array.from(set).map(value => encodeURIComponent(value));
    return encodedValues.map(value => key + '=' + value).join('&');
}

const checkQuestionFromPosition = async body => {
    const list = []

    body.questionTypes.forEach(value => {
        list.push(value)
    })
    body.programingTypes.forEach(value => {
        list.push(value)
    })
    body.frameworkTypes.forEach(value => {
        list.push(value)
    })
    await checkAllQuestions(list)
}

const checkAllQuestions = async list => {
    list.forEach(value => {
        const checkbox = document.querySelector(`input[name="${value}"]`);
        if (checkbox) {
            checkbox.checked = true;
        }
    });
}
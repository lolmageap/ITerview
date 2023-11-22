const positions = new Set()
const questionTypes = new Set()
const programingTypes = new Set()
const frameworkTypes = new Set()
const levels = new Set()

const closeTab = async () => {
    const checkbox = document.getElementById('checkbox')
    if (!checkbox.checked) {
        await closePosition()
        await closeCategory()
        await closeLevel()
        await closePrograming()
        await closeFramework()
        removeAllTypes()
        document.getElementById('cbx-1').checked = false
        document.getElementById('cbx-14').checked = false
        document.getElementById('cbx-47').checked = false
    }
}

const showPositionAndCheck = async () => {
    await showPosition()
    toggleCheckbox('cbx-1')
}

const showPosition = async () => {
    const list = document.getElementById('position-detail')
    if (list.style.display === '' || list.style.display === 'none') {
        list.style.display = 'flex'
    } else {
        await closePosition()
    }
}

const closePosition = async () => {
    const list = document.getElementById('position-detail')
    list.style.display = 'none'
    await uncheckChildren('position-detail')
    positions.clear()
}

const closeCategory = async () => {
    const list = document.getElementById('category-detail')
    list.style.display = 'none'
    await uncheckChildren('category-detail')
}

const closeLevel = async () => {
    const list = document.getElementById('level-detail')
    list.style.display = 'none'
    await uncheckChildren('level-detail')
    levels.clear()
}

const showCategoryAndCheck = async () => {
    await showCategory()
    toggleCheckbox('cbx-14')
}

const openCategory = () => {
    const list = document.getElementById('category-detail')
    list.style.display = 'inline'
    const checkbox = document.getElementById('cbx-14')
    checkbox.checked = true
}

const showCategory = async () => {
    const list = document.getElementById('category-detail')
    if (list.style.display === '' || list.style.display === 'none') {
        list.style.display = 'inline'
    } else {
        await closeCategory()
        await closePrograming()
        await closeFramework()
    }
}

const openProgramingAndFramework = () => {
    const framework = document.getElementById('framework-detail')
    const programing = document.getElementById('programing-detail')
    framework.style.display = 'flex'
    programing.style.display = 'flex'
}

const uncheckProgramingAndFramework = async () => {
    await uncheckChildren('framework-detail')
    await uncheckChildren('programing-detail')
}

const showProgramingAndCheck = async () => {
    await showPrograming()
    toggleCheckbox('cbx-22')
}

const showFrameworkAndCheck = async () => {
    await showFramework()
    toggleCheckbox('cbx-23')
}

const showLevelAndCheck = async () => {
    await showLevel()
    toggleCheckbox('cbx-47')
}

const showPrograming = async () => {
    const list = document.getElementById('programing-detail')
    if (list.style.display === '' || list.style.display === 'none') {
        list.style.display = 'flex'
    } else {
        await closePrograming()
        programingTypes.clear()
    }
}

const closePrograming = async () => {
    const list = document.getElementById('programing-detail')
    list.style.display = 'none'
    await uncheckChildren('programing-detail')
}

const showFramework = async () => {
    const list = document.getElementById('framework-detail')
    if (list.style.display === '' || list.style.display === 'none') {
        list.style.display = 'flex'
    } else {
        await closeFramework()
    }
}

const showLevel = async () => {
    const list = document.getElementById('level-detail')
    if (list.style.display === '' || list.style.display === 'none') {
        list.style.display = 'flex'
    } else {
        await closeLevel()
    }
}

const closeFramework = async () => {
    const list = document.getElementById('framework-detail')
    list.style.display = 'none'
    await uncheckChildren('framework-detail')
    frameworkTypes.clear()
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

const checkQuestions = async id => {
    toggleCheckbox(id)
    await addPositionInSet(id)
}

const addPositionInSet = async id => {
    const checkbox = document.getElementById(id)
    const type = checkbox.name
    const status = checkbox.checked

    if (status) {
        positions.add(type)
    } else {
        await uncheckChildren('category-detail')
        positions.delete(type)
    }

    openCategory()
    openProgramingAndFramework()
    await uncheckProgramingAndFramework()
    removeAllTypes()
    await sendPositionToServer()
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
    await checkQuestionFromPosition(body)
}

const makeRequestParams = (set, key) => {
    const encodedValues = Array.from(set).map(value => encodeURIComponent(value));
    return encodedValues.map(value => key + '=' + value).join('&');
}

const checkQuestionFromPosition = async body => {
    const list = []

    body.questionTypes.forEach(value => {
        questionTypes.add(value)
        list.push(value)
    })
    body.programingTypes.forEach(value => {
        programingTypes.add(value)
        list.push(value)
    })
    body.frameworkTypes.forEach(value => {
        frameworkTypes.add(value)
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

const removeAllTypes = () => {
    questionTypes.clear()
    programingTypes.clear()
    frameworkTypes.clear()
    levels.clear()
}

const addSetToQuestionAndToggle = (box, id) => {
    toggleCheckbox(id)
    addSetToQuestion(box)
}

const addSetToQuestion = box => {
    const name = box.getAttribute("name");
    if (questionTypes.has(name)) {
        questionTypes.delete(name)
    } else {
        questionTypes.add(name)
    }
}

const addSetToProgramingAndToggle = (box, id) => {
    toggleCheckbox(id)
    addSetToPrograming(box)
}

const addSetToPrograming = box => {
    const name = box.getAttribute("name");
    if (programingTypes.has(name)) {
        programingTypes.delete(name)
    } else {
        programingTypes.add(name)
    }
}

const addSetToFrameworkAndToggle = (box, id) => {
    toggleCheckbox(id)
    addSetToFramework(box)
}

const addSetToFramework = box => {
    const name = box.getAttribute("name");
    if (frameworkTypes.has(name)) {
        frameworkTypes.delete(name)
    } else {
        frameworkTypes.add(name)
    }
}

const addSetToLevelAndToggle = (box, id) => {
    toggleCheckbox(id)
    addSetToLevel(box)
}

const addSetToLevel = box => {
    const name = box.getAttribute("name");
    if (levels.has(name)) {
        levels.delete(name)
    } else {
        levels.add(name)
    }
}

const stairsInput = document.getElementById("stairs");
const stairsOutput = document.getElementById("stairsOutput");
const buildButton = document.getElementById("buildButton");
const appendButton = document.getElementById("appendButton");
const destroyButton = document.getElementById("destroyButton");

const getInputNumberOfStairs = () => parseInt(stairsInput.value);
const getNumberOfCurrentStairs = () => stairsOutput.rows.length;

const buildStairs = () => {
    const numberOfStairs = getInputNumberOfStairs();
    for (let index = 0; index < numberOfStairs; index++) {
        const row = stairsOutput.insertRow();
        for (let i = 0; i < index + 1; i++) {
            row.insertCell();
        }
    }
    updateButtonsState();
};

const appendStairs = () => {
    const numberOfStairs = getInputNumberOfStairs();
    for (let index = 0; index < numberOfStairs; index++) {
        const row = stairsOutput.insertRow();
        const numberOfCurrentRows = getNumberOfCurrentStairs();
        for (let i = 0; i < numberOfCurrentRows; i++) {
            row.insertCell();
        }
    }
    updateButtonsState();
};

const destroyStairs = () => {
    while (stairsOutput.rows.length > 0) {
        stairsOutput.deleteRow(0);
    }
    updateButtonsState();
};

const updateButtonsState = () => {
    buildButton.disabled = getNumberOfCurrentStairs() > 0;
    appendButton.disabled = getNumberOfCurrentStairs() == 0;
    destroyButton.disabled = getNumberOfCurrentStairs() == 0;
};

buildButton.addEventListener("click", e => {
    buildStairs();
});
appendButton.addEventListener("click", e => {
    appendStairs();
});
destroyButton.addEventListener("click", e => {
    destroyStairs();
});

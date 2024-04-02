const stairsInput = document.getElementById("stairs");
const stairsOutput = document.getElementById("stairsOutput");

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
};

document.getElementById("buildButton").addEventListener("click", e => {
    buildStairs();
});
document.getElementById("appendButton").addEventListener("click", e => {
    appendStairs();
});

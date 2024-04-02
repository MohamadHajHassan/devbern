let numberOfStairs = 0;

const buildStairs = () => {
    const stairsInput = document.getElementById("stairs");
    numberOfStairs = parseInt(stairsInput.value);
    const stairsOutput = document.getElementById("stairsOutput");
    for (let index = 0; index < numberOfStairs; index++) {
        const row = stairsOutput.insertRow();
        for (let i = 0; i < index + 1; i++) {
            row.insertCell();
        }
    }
};

document.getElementById("buildButton").addEventListener("click", e => {
    buildStairs();
});

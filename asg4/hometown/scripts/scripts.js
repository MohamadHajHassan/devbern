const inputTable = document.getElementById("inputTable");
const name = document.getElementById("nameId");
const email = document.getElementById("emailId");
const message = document.getElementById("messageId");
const submitToTable = document.getElementById("submitToTable");
const submitForm = document.getElementById("submitForm");

// Helper function to add a row to the table
const addRow = variable => {
    const row = inputTable.insertRow();
    const cell1 = row.insertCell(0);
    const cell2 = row.insertCell(1);
    const cell3 = row.insertCell(2);
    const cell4 = row.insertCell(3);

    cell1.innerHTML = variable.name;
    cell2.innerHTML = variable.value;
    cell3.innerHTML = `<button type="button" id="editButton${variable.name}">Edit</button>`;
    cell4.innerHTML = `<button type="button" id="deleteButton${variable.name}" class="deleteRow">Delete</button>`;

    const editButton = document.getElementById(`editButton${variable.name}`);
    const deleteButton = document.getElementById(
        `deleteButton${variable.name}`
    );

    editButton.addEventListener("click", e => {
        cell2.contentEditable = true;
        cell2.focus();
    });

    deleteButton.addEventListener("click", e => {
        inputTable.children[0].removeChild(row);
    });
};

const addValuesToTable = () => {
    // Delete all previous rows
    while (inputTable.rows.length > 0) {
        inputTable.deleteRow(0);
    }

    // Add new rows
    addRow(name);
    addRow(email);
    addRow(message);

    // Allow submit button to be clicked
    submitForm.disabled = false;
};

submitToTable.addEventListener("click", e => {
    addValuesToTable();
});

// Disable submit button until submitted to table first
submitForm.disabled = true;

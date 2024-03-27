const removeSecondElementFromArray = arr =>
    arr.slice(0, 1).concat(arr.slice(2));

const removeNthElementFromArray = (arr, n) =>
    arr.slice(0, n - 1).concat(arr.slice(n));

const array = ["A", "B", "C", "D", "E", "F", "G", "H"];
const arrayWithoutSecondElement = removeSecondElementFromArray(array);

const arrayWithoutFirstElement = removeNthElementFromArray(array, 1);
const arrayWithoutThirdElement = removeNthElementFromArray(array, 3);
const arrayWithoutEighthElement = removeNthElementFromArray(array, 8);

console.log(`Original array: ${array}
After removing second element: ${arrayWithoutSecondElement}
After removing third element: ${arrayWithoutThirdElement}
After removing first element: ${arrayWithoutFirstElement}
After removing eighth element: ${arrayWithoutEighthElement}`);

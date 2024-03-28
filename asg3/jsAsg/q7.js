const containsSevenRecursive = n => {
    if (n % 10 < 10) {
        return n % 10 == 7;
    }
    return false || containsSevenRecursive(Math.trunc(n / 10));
};

const luckyNumber = arr => {
    for (let i = 0; i < arr.length; i++) {
        const element = arr[i];
        if (containsSevenRecursive(element)) {
            return "LUCKY!";
        }
    }
    return "There is no 7 in the array ☹";
};

console.log(luckyNumber([1, 2, 3, 4, 5, 6, 7]));
console.log(luckyNumber([8, 6, 33, 100]));
console.log(luckyNumber([2, 55, 60, 97, 86]));

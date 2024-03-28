const isOdd = n => n % 2 == 1;

const reverseOdd = str => {
    const wordsArray = str.split(" ");
    const newWordsArray = [];
    for (let i = 0; i < wordsArray.length; i++) {
        newWordsArray.push(
            isOdd(wordsArray[i].length)
                ? wordsArray[i].split("").reverse().join("")
                : wordsArray[i]
        );
    }
    return newWordsArray.join(" ");
};

console.log(reverseOdd("Bananas"));
console.log(reverseOdd("One two three four"));
console.log(reverseOdd("Make sure uoy only esrever sdrow of ddo length"));

const removeNonLettersAndSpaces = str => str.replace(/[^a-zA-Z ]/g, "");

const getTopThreeLongestWords = str => {
    const wordsArray = str.split(" ");
    wordsArray.sort((a, b) => b.length - a.length);
    return wordsArray.slice(0, 3);
};

const getHashTags = str => {
    const strWithoutPunctuation = removeNonLettersAndSpaces(str);
    const topThreeLongestWordsArray = getTopThreeLongestWords(
        strWithoutPunctuation
    );

    const topThreeHashTags = [];
    for (let i = 0; i < topThreeLongestWordsArray.length; i++) {
        topThreeHashTags.push(`#${topThreeLongestWordsArray[i]}`);
    }

    return topThreeHashTags;
};

console.log(
    getHashTags("How the Avocado Became the Fruit of the Global Trade")
);
console.log(
    getHashTags(
        "Why You Will Probably Pay More for Your Christmas Tree This Year"
    )
);
console.log(getHashTags("Visualizing Science"));

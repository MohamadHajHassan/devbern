const isOdd = n => n % 2 == 1;

const sumOfDigitsRecursive = n => {
    if (n < 10) {
        return n;
    }
    return (n % 10) + sumOfDigitsRecursive(Math.trunc(n / 10));
};

const oddishOrEvenish = n =>
    isOdd(sumOfDigitsRecursive(n)) ? "Oddish" : "Evenish";

console.log(oddishOrEvenish(121));
console.log(oddishOrEvenish(41));

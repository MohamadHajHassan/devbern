const countTrue = arr => {
    let count = 0;
    for (let i = 0; i < arr.length; i++) {
        const element = arr[i];
        arr[i] && count++;
    }
    return count;
};

console.log(countTrue([true, false, false, true, true, false]));

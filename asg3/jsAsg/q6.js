const toArray = obj => Object.entries(obj);

console.log(toArray({}));
console.log(toArray({ a: 1, b: 2 }));
console.log(toArray({ a: 1, b: 2 })[0]);

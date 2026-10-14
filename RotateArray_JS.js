const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim().split(/\s+/).map(Number);

const x = input[0]; // array size
const y = input[1] // number of rotations

let arr = [];

for (let i = 2; i < 2 + x; i++){ // as we write everything in a single line, we have to ignore first 2 values
    arr.push(input[i])
}

if (x>0){
    const rotations = y % x;
    for (let i = 0; i < rotations; i++){
        let temp = arr[x - 1];

        for (let j=x-1; j>0; j--){
            arr[j] = arr[j-1];
        }

        arr[0] = temp;
    }
}

for (let k = 0; k < x; k++){
    console.log(arr[k])
}
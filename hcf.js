const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim().split(/\s+/).map(Number);

let x = input[0];
let y = input[1];

while (y != 0){
    let remainder = x%y;
    x = y;
    y = remainder;
}

console.log(x);
const fs = require("fs")
const input = Number(fs.readFileSync(0, "utf-8").trim())

let sum = 0

for (let i = 0; i <= input; i++){
    if (i%2!==0){
        sum += i
    }
}

console.log(sum);
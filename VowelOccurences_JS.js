let A = [
    "Java Programming", "Array Data Structures", "C Programming",
    "Augmented Reality", "Virtual Reality"
]

let result = [];

for (let i = 0; i < A.length; i++){
    let s = A[i];
    let vowels = [];

    for (let k = 0; k < s.length; k++){
        let ch = s[k];

        if (ch === 'a' || ch === 'e' || ch === 'i' || ch === 'o' || ch === 'u' ||
            ch === 'A' || ch === 'E' || ch === 'I' || ch === 'O' || ch === 'U'
        ){
            vowels.push(ch);
        }
    }

    result.push(vowels);
}

console.log(result);
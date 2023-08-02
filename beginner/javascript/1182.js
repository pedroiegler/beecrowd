let input = require('fs').readFileSync('/dev/stdin', 'utf-8').split('\n'); 

let line = parseInt(input.shift());
let operation = input.shift();

let matrice = new Array();

for(let i = 0; i < 12; i++){ 
    matrice.push(new Array());
    for(let j = 0; j < 12; j++){
        matrice[i][j] = parseFloat(input.shift());
    }
}

const operation_in_line = (mat, l, op) => {
    let sum = 0;
    for(i = 0; i < 12; i++){
        sum += mat[i][l];
    }
    if(op === 'S') return sum;
    else return sum / 12;
};

console.log(operation_in_line(matrice, line, operation).toFixed(1));
let input = require('fs').readFileSync('/dev/stdin', 'utf-8').split('\n'); 

let operation = input.shift();
let elementos_acima_diagonal = 0;

let matrice = new Array();

for(let i = 0; i < 12; i++){ 
    matrice.push(new Array());
    for(let j = 0; j < 12; j++){
        matrice[i][j] = parseFloat(input.shift());
    }
}
    
const operation_in_line = (mat, op) => {
    let sum = 0;
    for (i = 0; i < 12; i++) {
        for (j = i + 1; j < 12; j++) { 
            sum += mat[i][j];
            elementos_acima_diagonal++;
        }
    }
    if(op === 'S') return sum;
    else return sum / elementos_acima_diagonal;
};

console.log(operation_in_line(matrice, operation).toFixed(1));
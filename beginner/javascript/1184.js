let input = require('fs').readFileSync('/dev/stdin', 'utf-8').split('\n'); 

let operation = input.shift();
let cont = 0, i, j;

let mat = new Array();

for(i = 0; i < 12; i++){
    mat.push(new Array());
    for(j = 0; j < 12; j++){
        mat[i][j] = parseFloat(input.shift());
    }
}

const soma_or_media = (mat,op) => {
    let sum = 0;
    for(i = 0; i < 12; i++){
        for(j = 0; j < 12; j++){
            sum += mat[i][j];
            cont++;
        }
    }

    if(op === 'S')
        return sum;
    else if(op === 'M')
        return sum / cont;
};

console.log(soma_or_media(mat,operation).toFixed(1));
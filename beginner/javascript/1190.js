let input = require('fs').readFileSync('/dev/stdin', 'utf-8').split('\n'); 

var m = new Array();
var i, j;
var operacao;

operacao = input.shift();

for(i = 0; i < 12; i++){
    m.push(new Array());
    for(j = 0; j < 12; j++){
        m[i][j] = parseFloat(input.shift());
    }
}

console.log(soma_or_media(m,operacao).toFixed(1));


function soma_or_media(mat, op){
var i, j, cont = 0;
var soma = 0.0;

for(i = 0; i < 12; i++)
    for(j = 0; j < 12; j++)
        if (i < j && i > 12 - j - 1){
            soma += mat[i][j];
            cont++;
        }


if(op == 'S'){
    return soma;
} else{
    return soma/cont;
}
}
var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');

var i, n, maior = 0, posicao = 0;

for(i = 1; i <= 100; i++){
    n = parseInt(valores.shift());

    if(n > maior){
        maior = n;
        posicao = i;
    }
}

console.log(maior);
console.log(posicao);
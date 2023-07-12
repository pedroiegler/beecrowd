var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');

var i, n, cont = 0, soma = 0;

for(i = 0; i < 6; i++){
    n = parseFloat(valores.shift());
    if(n > 0){
        cont++;
        soma += n;
    }
}

console.log(cont + " valores positivos");
console.log((soma / cont).toFixed(1));
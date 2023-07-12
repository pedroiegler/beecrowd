var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');
var i, n, cont = 0;

for(i = 0; i < 5; i++){
    n = parseInt(valores.shift());
    if(n % 2 == 0){
        cont+=1;
    }
}

console.log(cont + " valores pares");
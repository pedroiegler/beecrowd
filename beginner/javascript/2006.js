let input = require('fs').readFileSync('stdin', 'utf-8').split('\n');

var cont = 0;
    
n = parseInt(input[0]);
var valores = input[1].split(" ");

for(i = 0; i < 5; i++){
    if(parseInt(valores[i]) == n)
        cont++;
}

console.log(cont);
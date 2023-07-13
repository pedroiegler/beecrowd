var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');
var n, i, cont = 0;

n = parseInt(valores.shift());

for(i = n; i > 0; i++){
    if(cont == 6){
        break;
    }
    else if(i % 2 != 0){
        console.log(i);
        cont++;
    }
}
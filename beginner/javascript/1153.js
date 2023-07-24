var input = require('fs').readFileSync('stdin', 'utf8');
var valores = input.split('\n');

var n, m = 1, i;

n = parseInt(valores.shift());

for(i = n; i >= 1; i--){
    m *= i;
}

console.log(m);

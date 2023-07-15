var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');

var i, n;

n = parseInt(valores.shift());

for(i = 1; i <= 10; i++){
    console.log(i + " x " + n + " = " + i*n);
}
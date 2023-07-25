var input = require('fs').readFileSync('stdin', 'utf8');
var valores = input.split(' ');

var soma = 0, i = 0;

var A = parseInt(valores[0]);
var N = parseInt(valores[1]);

while (N <= 0) {
    N = parseInt(valores[++i]);
}

for (var c = 0; c < N; c++) {
    soma = soma + A + c;
}

console.log(soma);

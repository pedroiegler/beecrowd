var input = require('fs').readFileSync('stdin', 'utf8');

var linhas = input.split('\n');

var valores = linhas[0].split(' ');

console.log((parseInt(valores[0]) + parseInt(valores[1]) + parseInt(valores[2]) + parseInt(valores[3])) - 3)
var input = require('fs').readFileSync('stdin', 'utf8');

var linhas = input.split('\n');

var frase = "LIFE IS NOT A PROBLEM TO BE SOLVED";
var n = parseInt(linhas.shift())

var resultado = "";

for (var i = 0; i < n; i++)
    resultado += frase[i]

console.log(resultado);
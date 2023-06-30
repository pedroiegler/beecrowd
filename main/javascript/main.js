var input = require('fs').readFileSync('stdin', 'utf8');

var linhas = input.split('\n');
var linha1 = linhas[0].split(' ');
var linha2 = linhas[1].split(' ');

var codPeca1 = parseInt(linha1[0]);
var numPeca1 = parseInt(linha1[1]);
var valorPeca1 = parseFloat(linha1[2]);

var codPeca2 = parseInt(linha2[0]);
var numPeca2 = parseInt(linha2[1]);
var valorPeca2 = parseFloat(linha2[2]);

var valorTotal = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2);

console.log("VALOR A PAGAR: R$ " + valorTotal.toFixed(2));

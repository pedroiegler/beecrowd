var input = require('fs').readFileSync('stdin', 'utf8');

var linhas = input.split('\n');

var linha1 = linhas[0].split(' ');
var linha2 = linhas[1].split(' ');

var x1 = parseFloat(linha1[0]);
var y1 = parseFloat(linha1[1]);
var x2 = parseFloat(linha2[0]);
var y2 = parseFloat(linha2[1]);

var distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

console.log(distancia.toFixed(4));

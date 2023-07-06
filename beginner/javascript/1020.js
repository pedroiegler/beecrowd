var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split("\n");

var idade = parseInt(valores[0]);


var ano = parseInt(idade / 365);
var resto = idade % 365;
var mes = parseInt(resto / 30);
var dias = parseInt(resto % 30);

console.log(ano + " ano(s)\n" + mes + " mes(es)\n" + dias + " dia(s)");
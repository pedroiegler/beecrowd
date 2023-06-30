var input = require('fs').readFileSync('stdin', 'utf8');

var values = input.split('\n');

var nome = values.shift();
var salarioFixo = parseFloat(values.shift());
var totalVendas = parseFloat(values.shift())

var valorGanho = salarioFixo + (totalVendas * 0.15);

console.log("TOTAL = R$ " + valorGanho.toFixed(2))
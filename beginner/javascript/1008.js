var input = require('fs').readFileSync('stdin', 'utf8');

var values = input.split('\n');

var numFunc = parseInt(values.shift());
var horasTrab = parseInt(values.shift());
var valorHora = parseFloat(values.shift());

var valorGanho = horasTrab * valorHora;

console.log("NUMBER = " + numFunc + "\nSALARY = U$ " + valorGanho.toFixed(2));
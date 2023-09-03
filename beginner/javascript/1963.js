let input = require('fs').readFileSync('stdin', 'utf-8').split(' ');

valor = parseFloat(input[0]);
valorNovo = parseFloat(input[1]);

diferenca_percentual = ((valorNovo - valor) / valor) * 100;

console.log(diferenca_percentual.toFixed(2) + "%");

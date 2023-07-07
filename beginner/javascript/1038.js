var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split(' ');

var cod = parseInt(valores.shift());
var qtd = parseInt(valores.shift());

var cod1 = qtd * 4.00;
var cod2 = qtd * 4.50;
var cod3 = qtd * 5.00;
var cod4 = qtd * 2.00;
var cod5 = qtd * 1.50;

if(cod == 1)
    console.log("Total: R$ " + cod1.toFixed(2));
else if(cod == 2)
    console.log("Total: R$ " + cod2.toFixed(2));
else if(cod == 3)
    console.log("Total: R$ " + cod3.toFixed(2));
else if(cod == 4)
    console.log("Total: R$ " + cod4.toFixed(2));
else if(cod == 5)
    console.log("Total: R$ " + cod5.toFixed(2));
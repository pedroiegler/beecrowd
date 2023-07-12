var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');

var salario = parseFloat(valores.shift());

if(salario >= 0.00 && salario <= 2000.00){
    console.log("Isento");
} else if(salario >= 2000.01 && salario <= 3000.00){
    console.log("R$ " + ((salario - 2000)  * 0.08).toFixed(2));
} else if(salario >= 3000.01 && salario <= 4500.00){
    console.log("R$ " + ((1000 * 0.08) + ((salario - 3000) * 0.18)).toFixed(2));
} else{
    console.log("R$ " + ((1000 * 0.08) + (1500 * 0.18)  + ((salario - 4500) * 0.28)).toFixed(2));
}  
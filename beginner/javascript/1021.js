var input = require('fs').readFileSync('stdin', 'utf8');

valores = input.split('\n');

valorInformado = parseFloat(valores.shift());
valor = 0;

console.log("NOTAS:")

valor = Math.floor(valorInformado / 100);
console.log(valor + " nota(s) de R$ 100.00");
valorInformado = valorInformado % 100;

valor = Math.floor(valorInformado / 50);
console.log(valor + " nota(s) de R$ 50.00");
valorInformado = valorInformado % 50;

valor = Math.floor(valorInformado / 20);
console.log(valor + " nota(s) de R$ 20.00");
valorInformado = valorInformado % 20;

valor = Math.floor(valorInformado / 10);
console.log(valor + " nota(s) de R$ 10.00");
valorInformado = valorInformado % 10;

valor = Math.floor(valorInformado / 5);
console.log(valor + " nota(s) de R$ 5.00");
valorInformado = valorInformado % 5;

valor = Math.floor(valorInformado / 2);
console.log(valor + " nota(s) de R$ 2.00");
valorInformado = valorInformado % 2;

valorInformado *= 100;
console.log("MOEDAS:");

valor = Math.floor(valorInformado / 100);
console.log(valor + " moeda(s) de R$ 1.00");
valorInformado = valorInformado % 100;

valor = Math.floor(valorInformado / 50);
console.log(valor + " moeda(s) de R$ 0.50");
valorInformado = valorInformado % 50;

valor = Math.floor(valorInformado / 25);
console.log(valor + " moeda(s) de R$ 0.25");
valorInformado = valorInformado % 25;

valor = Math.floor(valorInformado / 10);
console.log(valor + " moeda(s) de R$ 0.10");
valorInformado = valorInformado % 10;

valor = Math.floor(valorInformado / 5);
console.log(valor + " moeda(s) de R$ 0.05");
valorInformado = valorInformado % 5;

valor = Math.floor(valorInformado / 1);
console.log(valor + " moeda(s) de R$ 0.01");
valorInformado = valorInformado % 1;



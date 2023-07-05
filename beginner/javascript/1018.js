var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split("\n");

var n = valores[0];

var n100 = parseInt(n / 100);
var n1resto = parseInt(n % 100);
var n50 = parseInt(n1resto / 50);
var n2resto = parseInt(n1resto % 50);
var n20 = parseInt(n2resto / 20);
var n3resto = parseInt(n2resto % 20);
var n10 = parseInt(n3resto / 10);
var n4resto = parseInt(n3resto % 10);
var n5 = parseInt(n4resto / 5);
var n5resto = parseInt(n4resto % 5);
var n2 = parseInt(n5resto / 2);
var n6resto = parseInt(n5resto % 2);
var n1 = parseInt(n6resto / 1);

console.log(n);
console.log(n100 + " nota(s) de R$ 100,00\n" +
            n50 + " nota(s) de R$ 50,00\n" +
            n20 + " nota(s) de R$ 20,00\n" +
            n10 + " nota(s) de R$ 10,00\n" + 
            n5 + " nota(s) de R$ 5,00\n" + 
            n2 + " nota(s) de R$ 2,00\n" + 
            n1 + " nota(s) de R$ 1,00"); 
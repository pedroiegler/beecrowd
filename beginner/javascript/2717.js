const fs = require('fs');
const input = fs.readFileSync('stdin', 'utf8');
const lines = input.trim().split('\n');

var n, a, b;

n = parseInt(lines.shift());

var valores = lines.shift().split(" ");

a = parseInt(valores[0]);
b = parseInt(valores[1]);

if((a + b) > n)
    console.log("Deixa para amanha!");
else
    console.log("Farei hoje!");
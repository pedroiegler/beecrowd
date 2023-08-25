var input = require('fs').readFileSync('stdin', 'utf8');

var linhas = input.split("\n");

var carta1, carta2;

var valores = linhas[0].split(" ");

carta1 = parseInt(valores[0]);
carta2 = parseInt(valores[1]);

if (carta2 > carta1)
    console.log(carta2);
else
    console.log(carta1);

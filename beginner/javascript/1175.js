var input = require('fs').readFileSync('stdin', 'utf8');
var linhas = input.split('\n');

var i, temp;
var n = [];

for (i = 0; i < 20; i++) {
    n[i] = parseInt(linhas.shift());
}

for (i = 0; i < 10; i++) {
    temp = n[i];
    n[i] = n[19 - i];
    n[19 - i] = temp;
}

for (i = 0; i < 20; i++) {
    console.log(`N[${i}] = ${n[i]}`);
}
var input = require('fs').readFileSync('stdin', 'utf8');
var linhas = input.split('\n');

var i;
var v = [];
var n;

n = parseFloat(linhas.shift());

for (i = 0; i < 100; i++) {
    v[i] = n;
    n /= 2.0;
}

for (i = 0; i < 100; i++) {
    console.log(`N[${i}] = ${v[i].toLocaleString('en-US', { minimumFractionDigits: 4 })}`);
}

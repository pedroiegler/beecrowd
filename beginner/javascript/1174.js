var input = require('fs').readFileSync('stdin', 'utf8');
var linhas = input.split('\n');

var v = [];
var i;

for(i = 0; i < 100; i++){
    v[i] = parseFloat(linhas.shift());
}

for(i = 0; i < 100; i++){
    if(v[i] <= 10){
        console.log(`A[${i}] = ${v[i].toFixed(1)}`);
    }
}

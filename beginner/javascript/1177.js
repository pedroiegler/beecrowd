var input = require('fs').readFileSync('stdin', 'utf8');
var linhas = input.split('\n');

var i, n, aux = 0;
var v = [];

n = parseInt(linhas.shift());

for(i = 0; i < 1000; i++){
    v[i] = aux;
    aux++;
    if(aux == n){
        aux = 0;
    }
}

for(i = 0; i < 1000; i++){
    console.log(`N[${i}] = ${v[i]}`);
}
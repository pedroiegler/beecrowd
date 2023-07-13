var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');

var i, n;

n = parseInt(valores.shift());

for(i = 1; i <= n; i++){
    if(i % 2 != 0){
        console.log("%d", i);
    }
}

var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');

var n, i;

n = parseInt(valores.shift());

for(i = 0; i < 10000; i++){
    if(i % n == 2){
        console.log(i);
    }
}

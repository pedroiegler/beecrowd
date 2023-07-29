var input = require('fs').readFileSync('stdin', 'utf8');
var linhas = input.split('\n');

var x = [];
var i;

for(i = 0; i < 10; i++){
    x[i] = parseInt(linhas.shift());

    if(x[i] < 0 || x[i] == 0){
        x[i] = 1;
    }
}

for(i = 0; i < 10; i++){
    console.log(`X[${i}] = ${x[i]}`);
}

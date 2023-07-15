var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');

var n, i, x;

n = parseInt(valores.shift());

for(i = 0; i < n; i++){
    x = parseInt(valores.shift());

    if(x == 0)
        console.log("NULL");
    else if(x > 0 && x % 2 == 0)
        console.log("EVEN POSITIVE");
    else if(x > 0 && x % 2 != 0)
        console.log("ODD POSITIVE");
    else if(x < 0 && x % 2 == 0)
        console.log("EVEN NEGATIVE");
    else if(x < 0 && x % 2 != 0)
        console.log("ODD NEGATIVE");
}
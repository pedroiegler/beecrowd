const fs = require('fs');
const input = fs.readFileSync('stdin', 'utf8');
const lines = input.trim().split('\n');

var n, i, a, b, c, val;

n = parseInt(lines.shift());

for(i = 1; i <= n; i++){
    val = lines.shift();

    var valores = lines.shift().split(" ");
    
    a = parseInt(valores[0]);
    b = parseInt(valores[1]);
    c = parseInt(valores[2]);

    if(val == "eye"){
        console.log(`Caso #${i}: ${parseInt(0.30*a + 0.59*b + 0.11*c)}`);
    } else if(val == "mean"){
        console.log(`Caso #${i}: ${parseInt((a + b + c) / 3)}`);
    } else if(val == "max"){
        if(a > b && a > c)
            console.log(`Caso #${i}: ${a}`);
        else if(b > a && b > c)
            console.log(`Caso #${i}: ${b}`);
        else
            console.log(`Caso #${i}: ${c}`);
    } else if(val == "min"){
        if(a < b && a < c)
            console.log(`Caso #${i}: ${a}`);
        else if(b < a && b < c)
            console.log(`Caso #${i}: ${b}`);
        else
            console.log(`Caso #${i}: ${c}`);
    }
}
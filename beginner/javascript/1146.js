var input = require('fs').readFileSync('stdin', 'utf8');
var valores = input.split('\n');

var n = 1, valores;
var str = "";

while (n != 0){
    n = parseInt(valores.shift());

    for(x = 1; x <= n; x++){
        if(x == n)
            str += `${x}\n`;
        else
        str += `${x} `;
    }
}

console.log(str);

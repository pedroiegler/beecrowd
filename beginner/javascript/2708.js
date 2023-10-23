const fs = require('fs');
const input = fs.readFileSync('stdin', 'utf8');
const lines = input.trim().split('\n');

var action;
var n, cont1 = 0, cont2 = 0;

while(true){

    var valores = lines.shift().split(" ");
    action = valores[0];

    if(valores[0] == "ABEND")
        break;
    else{
        n = parseInt(valores[1]);

        if(valores[0] == "SALIDA"){
            cont1+=n;
            cont2+=1;
        } else{
            cont1-=n;
            cont2-=1;
        }
    }
}

console.log(`${cont1}\n${cont2}`);
const fs = require('fs');
const input = fs.readFileSync('stdin', 'utf8');
const lines = input.trim().split('\n');

let index = 0;

var n = 1, i, jogada, contM, contJ;

for(;;){
    n = parseInt(lines.shift());

    if(n == 0)
        break;
        
    contM = 0;
    contJ = 0;

    var valores = lines.shift().split(" ");

    for(i = 0; i < n; i++){
        jogada = parseInt(valores[i]);

        if(jogada == 0)
            contM+=1;
        else
            contJ+=1;
    }

    console.log(`Mary won ${contM} times and John won ${contJ} times`);
}
var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

var p, q, cnt = 0, i, dif;

var valores = lines[0].split(" ");

p = parseInt(valores[0]);
q = parseInt(valores[1]);

var jump = lines[1].split(" ").map(Number);

for(i = 1; i < q; i++){
    if(jump[i] > jump[i-1])
        dif = (jump[i] - jump[i-1]);
    else
        dif = (jump[i-1] - jump[i]);
    if(dif <= p)
        cnt++;
}

if(cnt === q - 1)
    console.log("YOU WIN");
else
    console.log("GAME OVER");

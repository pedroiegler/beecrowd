var input = require('fs').readFileSync('stdin', 'utf8').split('\n');

var i, n, p1, p2;

n = parseInt(input.shift());

for(i = 0; i < n; i++){

    var info = input.shift().split(" ");
    var nome1 = info[0];
    var jogada1 = info[1];
    var nome2 = info[2];
    var jogada2 = info[3];

    var jogadas = input.shift().split(" ");
    var p1 = parseInt(jogadas[0]);
    var p2 = parseInt(jogadas[1]);

    if ((p1 + p2) % 2 == 0) {
        if (jogada1 == "PAR") {
            console.log(nome1);
        } else {
            console.log(nome2);
        }
    } else {
        if (jogada1 == "IMPAR") {
            console.log(nome1);
        } else {
            console.log(nome2);
        }
    }
}
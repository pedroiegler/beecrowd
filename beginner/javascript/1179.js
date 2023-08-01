var input = require('fs').readFileSync('stdin', 'utf8');
var linhas = input.split('\n');

var i, j, n, auxPar = 0, auxImpar = 0;
var vetPar = [];
var vetImpar = [];

for (i = 0; i < 15; i++) {
    n = parseInt(linhas.shift());
    if (n % 2 == 0) {
        vetPar[auxPar] = n;
        auxPar++;

        if (auxPar == 5) {
            for (j = 0; j < 5; j++) {
                console.log(`par[${j}] = ${vetPar[j]}`);
            }
            auxPar = 0;
        }
    } else {
        vetImpar[auxImpar] = n;
        auxImpar++;
        if (auxImpar == 5) {
            for (j = 0; j < 5; j++) {
                console.log(`impar[${j}] = ${vetImpar[j]}`);
            }
            auxImpar = 0;
        }
    }
}

for (i = 0; i < auxImpar; i++) {
    console.log(`impar[${i}] = ${vetImpar[i]}`);
}
for (i = 0; i < auxPar; i++) {
    console.log(`par[${i}] = ${vetPar[i]}`);
}
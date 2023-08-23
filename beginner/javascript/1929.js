var input = require('fs').readFileSync('stdin', 'utf8');

var linhas = input.trim().split('\n');

for (var i = 0; i < linhas.length; i++) {
    var numeros = linhas[i].split(" ").map(Number);

    for (var j = 0; j < 3; j++) {
        for (var k = j + 1; k < 4; k++) {
            if (numeros[j] > numeros[k]) {
                var temp = numeros[j];
                numeros[j] = numeros[k];
                numeros[k] = temp;
            }
        }
    }

    if (numeros[0] + numeros[1] > numeros[2] || numeros[1] + numeros[2] > numeros[3]) 
        console.log("S");
    else 
        console.log("N");
}

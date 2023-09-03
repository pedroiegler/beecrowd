let input = require('fs').readFileSync('stdin', 'utf-8').split('\n');

var nota, maior = 0;
var n, i, matricula, matricular_maior = 0;

n = parseInt(input.shift());

for (i = 0; i < n; i++) {
    var valores = input.shift().split(" ");
    matricula = parseInt(valores[0]);
    nota = parseFloat(valores[1]);

    if (nota > maior) {
        maior = nota;
        matricular_maior = matricula;
    }
}

if (maior >= 8) {
    console.log(matricular_maior);
} else {
    console.log("Minimum note not reached");
}

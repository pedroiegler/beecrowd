const input = require('fs').readFileSync('stdin', 'utf8');

const valores = input.split('\n');

var n1, n2, media = 0, nota_valida = 0, x = 1;

do {
    while (nota_valida !== 2) {
        const nota = parseFloat(valores.shift());

        if (nota < 0.0 || nota > 10.0) {
            console.log("nota invalida");
        } else {
            nota_valida++;
            if (nota_valida === 1) {
                n1 = nota;
            } else if (nota_valida === 2) {
                n2 = nota;
            }
        }
    }

    media = (n1 + n2) / 2.0;

    console.log(`media = ${media.toFixed(2)}`);

    nota_valida = 0; // Resetting nota_valida here

    do {
        console.log("novo calculo (1-sim 2-nao)");
        x = parseInt(valores.shift());
    } while (x !== 1 && x !== 2);

} while (x === 1);

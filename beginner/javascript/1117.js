const input = require('fs').readFileSync('stdin', 'utf8');

const valores = input.split('\n');

let n1, n2, media, nota_valida = 0;

while (nota_valida !== 2) {
    const nota = parseFloat(valores.shift()); 

    if (nota < 0.0 || nota > 10.0) {
        console.log("nota invalida");
    } else {
        nota_valida++;
        if (nota_valida == 1) {
            n1 = nota;
        } else if(nota_valida == 2){
            n2 = nota;
        }

    }
}

media = (n1 + n2) / 2.0;

console.log(`media = ${media.toFixed(2)}`);

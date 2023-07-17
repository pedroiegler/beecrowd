var input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

let n, quant, contR = 0, contS = 0, contC = 0, contT = 0;
let mediaS = 0, mediaR = 0, mediaC = 0;
let tipo;

n = parseInt(lines.shift());

for (let i = 0; i < n; i++) {
    const values = lines.shift().split(' ');
    quant = parseInt(values[0]);
    tipo = values[1];

    contT += quant;

    if (tipo === 'R')
        contR += quant;
    else if (tipo === 'S')
        contS += quant;
    else if (tipo === 'C')
        contC += quant;
}

mediaS = (contS * 100.0) / contT;
mediaR = (contR * 100.0) / contT;
mediaC = (contC * 100.0) / contT;

console.log("Total: " + contT + " cobaias");
console.log("Total de coelhos: " + contC);
console.log("Total de ratos: " + contR);
console.log("Total de sapos: " + contS);
console.log("Percentual de coelhos: " + mediaC.toFixed(2) + " %");
console.log("Percentual de ratos: " + mediaR.toFixed(2) + " %");
console.log("Percentual de sapos: " + mediaS.toFixed(2) + " %");

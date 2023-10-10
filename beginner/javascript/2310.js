var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split("\n");

var nome;
var i, n, s, b, a, s1, b1, a1, somaS = 0, somaS1 = 0, somaB = 0, somaB1 = 0, somaA = 0, somaA1 = 0;
var pontosS, pontosB, pontosA;

n = parseInt(lines.shift());

for(i = 0; i < n; i++){
    nome = lines.shift();

    var valores = lines.shift().split(" ");

    s = parseInt(valores[0]);
    b = parseInt(valores[1]);
    a = parseInt(valores[2]);

    var valores1 = lines.shift().split(" ");

    s1 = parseInt(valores1[0]);
    b1 = parseInt(valores1[1]);
    a1 = parseInt(valores1[2]);

    somaS += s;
    somaS1 += s1;
    somaB += b;
    somaB1 += b1;
    somaA += a;
    somaA1 += a1;

}

pontosS = (somaS1 * 100.0) / somaS;
pontosB = (somaB1 * 100.0) / somaB;
pontosA = (somaA1 * 100.0) / somaA;

console.log(`Pontos de Saque: ${pontosS.toFixed(2)} %.`);
console.log(`Pontos de Bloqueio: ${pontosB.toFixed(2)} %.`);
console.log(`Pontos de Ataque: ${pontosA.toFixed(2)} %.`);
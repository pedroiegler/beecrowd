var input = require('fs').readFileSync('stdin', 'utf8');

var linha = input.split('\n');
var linha1 = linha[0].split(' ');

var n1 = parseFloat(linha1.shift());
var n2 = parseFloat(linha1.shift());
var n3 = parseFloat(linha1.shift());
var n4 = parseFloat(linha1.shift());

var media = ((n1 * 2.0) + (n2 * 3.0) + (n3 * 4.0) + (n4 * 1.0)) / 10.0;

console.log("Media: " + media.toFixed(1));

if(media >= 7.0){
    console.log("Aluno aprovado.");
} else if(media < 5.0){
    console.log("Aluno reprovado.");
} else{
    console.log("Aluno em exame.");
    var vExame = parseFloat(linha[1]);
    console.log("Nota do exame: " + vExame.toFixed(1));
    media = (vExame + media) / 2;
    if(media >= 5.0){
        console.log("Aluno aprovado.");
        console.log("Media final: " + media.toFixed(1));
    } else{
        console.log("Aluno reprovado.");
        console.log("Media final: " + media.toFixed(1));
    }
}
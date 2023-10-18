var fs = require("fs");
var input = fs.readFileSync("stdin", "utf8");
var lines = input.split("\n");

var N;
var i;
var maior;
var posicao = 0;

N = parseInt(lines.shift());

var vetor = [N];
var valores = lines.shift().split(" ");

for (i = 0; i< N; i++){
    vetor[i] = parseInt(valores.shift());
}

maior = vetor[0];

for(i = 0; i < N-1; i++){
    if (vetor[i+1] > maior){
        maior = vetor[i+1];
    }
    
    if (vetor[i+1] < maior){
        posicao = i+2;
        break;
    }
}

console.log(posicao);
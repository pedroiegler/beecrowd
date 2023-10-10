var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split("\n");

let n = parseInt(lines.shift());
        
for (let i = 0; i < n; i++) {
    let soma = 0.0;
    
    let nome = lines.shift();
    let num = parseInt(lines.shift());
    let maior = 0.0;
    let menor = 0.0;
    
    var valores = lines.shift().split(" ");
    for (var j = 0; j < 7; j++) {
        var notas = parseFloat(valores[j]);
        
        if (j == 0) {
            maior = notas;
            menor = notas;
        }
        
        if (notas > maior) {
            maior = notas;
        }
        
        if (notas < menor) {
            menor = notas;
        }
        
        soma += notas;
    }
    
    console.log(nome + " " + ((soma - (maior + menor)) * num).toFixed(2));
}
        
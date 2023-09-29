var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split("\n");

var n, m;
var valores = lines.shift().split(" ");
n = parseInt(valores[0]);
m = parseInt(valores[1]);
var matriz = [];

for (var i = 0; i < n; i++) {
    matriz[i] = [];
    var valoress = lines.shift().split(" "); 
    for (var j = 0; j < m; j++) {
        matriz[i][j] = parseInt(valoress[j]);
    }
}

for (var i = 1; i < n - 1; i++) {
    for (var j = 1; j < m - 1; j++) {
        if (matriz[i][j] == 42 &&
            matriz[i - 1][j - 1] == 7 && matriz[i - 1][j] == 7 && matriz[i - 1][j + 1] == 7 &&
            matriz[i][j - 1] == 7 && matriz[i][j + 1] == 7 &&
            matriz[i + 1][j - 1] == 7 && matriz[i + 1][j] == 7 && matriz[i + 1][j + 1] == 7) {
            console.log(`${i + 1} ${j + 1}`);
            return;
        }
    }
}

console.log("0 0");

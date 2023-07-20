var input = require('fs').readFileSync('stdin', 'utf8');
var linha = input.split('\n');
var valores, n, x, y, i, result;

n = parseInt(linha[0]);

for (i = 1; i <= n; i++) {
    valores = linha[i].split(' ').map((valor) => parseInt(valor));

    if (valores[1] === 0) {
        console.log("divisao impossivel");
    } else {
        result = valores[0] / valores[1];
        console.log(result.toFixed(1));
    }
}

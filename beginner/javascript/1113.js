var input = require('fs').readFileSync('stdin', 'utf8');
var linhas = input.split('\n');
var i = -1;

while (true) {
    i += 1;
    var valores = linhas[i].split(' ').map(num => parseInt(num));

    if (valores[0] == valores[1]) {
        break;
    } else if (valores[0] < valores[1]) {
        console.log("Crescente");
    } else {
        console.log("Decrescente");
    }
}

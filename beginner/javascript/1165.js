var input = require('fs').readFileSync('stdin', 'utf8');
var linhas = input.split('\n');

var i, j, n, num;

n = parseInt(linhas.shift());

for (i = 0; i < n; i++) {
    num = parseInt(linhas.shift());

    s = 0;
    j = 1;

    while (j <= num) {
        if (num % j == 0) {
            s = s + 1;
        }
        j = j + 1;
    }

    if (s > 2) {
        console.log(num + " nao eh primo");
    } else {
        console.log(num + " eh primo");
    }
}
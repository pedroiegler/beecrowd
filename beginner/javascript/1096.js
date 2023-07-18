var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');

var i, j;

for (i = 1, j = 7; i <= 9; j--) {
    console.log("I="+i+" J="+j);

    if (j == 5) {
        i += 2;
        j = 8;
    }
}
var input = require('fs').readFileSync('stdin', 'utf8');
var valores = input.split('\n');

var x, y, a = 0, b = 1, c = 0, str = '';

x = parseInt(valores.shift());

for (y = 0; y < x; y++) {
    if (y === 0) {
        str += `${a} `;
    } else if (y === 1) {
        str += `${b} `;
    } else {
        c = a + b;
        a = b;
        b = c;
        str += `${c} `;
    }
}

console.log(str.trim());

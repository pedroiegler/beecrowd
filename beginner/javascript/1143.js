const input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');

var n = parseInt(valores.shift());

for(i = 1; i <= n; i++){
    console.log(`${i} ${i**2} ${i**3}`);
}
 

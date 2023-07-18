var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');
var i,j;

for(i = 1; i <= 9; i = i + 2){
    for(j = 6 + i; j > 3 + i; j--)
        console.log(`I=${i} J=${j}`);
}

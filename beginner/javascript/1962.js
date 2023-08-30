var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

var n, i, value;

n = parseInt(lines.shift());

for(i = 0; i < n; i++){
    value = parseInt(lines.shift());

    if(value >= 2015){
        console.log("%d A.C.", value-2014);
    } else{
        console.log("%d D.C.", 2015-value);
    }
}
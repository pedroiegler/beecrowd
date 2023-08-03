let input = require('fs').readFileSync('/dev/stdin', 'utf-8').split('\n'); 

var n, i;
var str = '';

n = parseInt(input.shift());

for(i = 1; i <= n; i++){
    if(i == n)
      str += `Ho!`;
    else
      str += `Ho `;
}

console.log(str);
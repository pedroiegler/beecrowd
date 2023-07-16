var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

var n = parseInt(lines[0]);

for (var i = 1; i <= n; i++) {
  var values = lines[i].split(' ').map(parseFloat);
  var weightedAverage = (values[0] * 2 + values[1] * 3 + values[2] * 5) / 10;
  console.log(weightedAverage.toFixed(1));
}

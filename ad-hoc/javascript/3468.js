var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

var idea = lines.shift().toLowerCase();

if (idea == "oposicao" || idea == "contrariedade") {
    console.log("mas");
} else if (idea == "quantidade" || idea == "intensidade") {
    console.log("mais");
}
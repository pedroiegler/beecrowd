var input = require('fs').readFileSync('stdin', 'utf8');

var values = input.split('\n');

var pi = 3.14159;

var raio = parseFloat(values.shift());

var volume = (4/3.0) * pi * Math.pow(raio,3);

console.log("VOLUME = " + volume.toFixed(3));

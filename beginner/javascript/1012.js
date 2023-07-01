var input = require('fs').readFileSync('stdin', 'utf8');

var linhas = input.split(' ');

var a = parseFloat(linhas.shift());
var b = parseFloat(linhas.shift());
var c = parseFloat(linhas.shift());

var pi = 3.14159;

var areaTriangulo = (a*c) / 2;
var areaCirculo = pi * Math.pow(c,2);
var areaTrapezio = ((a + b) * c) / 2;
var areaQuadrado = Math.pow(b,2);
var areaRetangulo = a * b;

console.log("TRIANGULO: " + areaTriangulo.toFixed(3) +
            "\nCIRCULO: " + areaCirculo.toFixed(3) +
            "\nTRAPEZIO: " + areaTrapezio.toFixed(3) +
            "\nQUADRADO: " + areaQuadrado.toFixed(3) +
            "\nRETANGULO: " + areaRetangulo.toFixed(3));
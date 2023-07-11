var valores = input.split('\n');
var cont = 0;

for (i = 0; i < 6; i++) {
    n = parseFloat(valores.shift());
    if (n > 0) {
        cont++;
    }
}

console.log(cont + " valores positivos");
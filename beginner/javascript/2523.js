var fs = require("fs");
var input = fs.readFileSync("stdin", "utf8");
var lines = input.split("\n");

var n, i, j, n1;
var alfabeto = [];

for (var k = 0; k < lines.length - 2; k += 3) { 
    var alfabetoStr = lines[k];
    n = parseInt(lines[k + 1]);
    var valores = lines[k + 2].split(" ");

    for (i = 0; i < n; i++) {
        n1 = parseInt(valores[i]);

        for (j = 0; j < alfabetoStr.length; j++) {
            var letra = alfabetoStr[j];

            if (i === n - 1) {
                if (j + 1 === n1) {
                    console.log(letra);
                }
            } else {
                if (j + 1 === n1) {
                    process.stdout.write(letra);
                }
            }
        }
    }
}

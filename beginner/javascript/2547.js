var fs = require("fs");
var input = fs.readFileSync("stdin", "utf8");
var lines = input.trim().split("\n");

var i = 0;

while (i < lines.length) {
    const [n, nn, nm] = lines[i].split(" ").map(Number);
    i++;

    let cont = 0;

    for (let j = 0; j < n; j++) {
        const x = parseInt(lines[i]);
        i++;
        if (x >= nn && x <= nm) {
            cont++;
        }
    }

    console.log(cont);
}

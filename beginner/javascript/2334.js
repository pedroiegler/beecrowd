var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split("\n");

var p;

while (true) {
    p = BigInt(lines.shift());

    if (p === BigInt(-1)) {
        break;
    } else {
        if (p <= BigInt(1)) {
            console.log("0");
        } else {
            var result = p - BigInt(1);
            console.log(result);
        }
    }
}


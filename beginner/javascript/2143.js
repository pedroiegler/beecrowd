var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split("\n");

var t, n;

t = parseInt(lines.shift());

while (t != 0) {
    for (var i = 1; i <= t; i++) {
        n = parseInt(lines.shift());
        if (n % 2 != 0) 
            console.log((n * 2) - 1);
        else 
            console.log((n * 2) - 2);
    }
    
    t = parseInt(lines.shift());
}
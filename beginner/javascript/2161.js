var fs = require("fs");
var input = fs.readFileSync("stdin", "utf8");
var lines = input.split("\n");

var n = parseFloat(lines.shift());
var ans = 0.0;
        
while (n-- > 0) {
    ans += 6.0;
    ans = 1.0 / ans;
}

ans += 3.0;
console.log(ans.toFixed(10));
const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

var i, j;

rl.on('line', (input) => {
    const n = parseInt(input);
    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
            if (j == n - i - 1) 
                console.log(2);

            else if (i == j) 
                console.log(1);

            else 
                console.log(3);
        }
        console.log("\n");
    }
});

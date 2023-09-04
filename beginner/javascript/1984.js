const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', (input) => {
  let n = parseInt(input);
  while (n) {
    let i = n % 10;
    n = Math.floor(n / 10);
    process.stdout.write(i.toString());
  }
  process.stdout.write('\n');
});

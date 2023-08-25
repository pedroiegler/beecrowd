const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', (line) => {
  const numero = parseFloat(line);
  console.log(`${numero.toExponential(4)}`);
});

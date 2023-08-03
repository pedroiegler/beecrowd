const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', (input) => {
  const n = parseInt(input);
  if (n === 0)
    console.log("vai ter copa!");
  else
    console.log("vai ter duas!");
});

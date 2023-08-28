const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('', input => {
  const [a, b, c] = input.split(' ').map(Number);

  const s = (a + b + c) / 2;
  const area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

  console.log(area.toFixed(3) + ' m2');

  rl.close();
});

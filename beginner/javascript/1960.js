const readline = require('readline');

const vaNum = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1];
const vaRom = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"];

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question((N) => {
  N = parseInt(N);

  let i = 0;
  while (N > 0) {
    if (N >= vaNum[i]) {
      process.stdout.write(vaRom[i]);
      N -= vaNum[i];
    } else {
      i++;
    }
  }

  console.log();
  rl.close();
});

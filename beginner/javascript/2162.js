const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('', (input) => {
  const lines = input.trim().split('\n');
  const N = parseInt(lines[0]);
  const H = lines[1].split(' ').map(Number);
  let padrao = 0;

  if (N > 2) {
    for (let i = 2; i < N; i++) {
      if ((H[i - 2] > H[i - 1] && H[i - 1] < H[i]) || (H[i - 2] < H[i - 1] && H[i - 1] > H[i])) {
        padrao = 1;
      } else {
        padrao = 0;
        break;
      }
    }
  } else {
    if (H[0] !== H[1]) {
      padrao = 1;
    }
  }

  console.log(padrao);
  rl.close();
});

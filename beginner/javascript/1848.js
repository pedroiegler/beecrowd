const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let sum = 0;

rl.on('line', (crow) => {
  if (crow === 'caw caw') {
    console.log(sum);
    sum = 0;
  } else {
    if (crow === '--*')
      sum += 1;

    if (crow === '-*-')
      sum += 2;

    if (crow === '*--')
      sum += 4;

    if (crow === '---')
      sum += 0;

    if (crow === '***')
      sum += 7;

    if (crow === '**-')
      sum += 6;

    if (crow === '-**')
      sum += 3;

    if (crow === '*-*')
      sum += 5;
  }
});

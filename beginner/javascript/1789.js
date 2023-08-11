const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const levels = (speed) => {
  if (speed < 10) {
    return 1;
  } else if (speed < 20) {
    return 2;
  } else {
    return 3;
  }
};

rl.on('line', (line) => {
  const n = parseInt(line);

  rl.once('line', (speedLine) => {
    const speeds = speedLine.split(' ').map(Number);
    let m = 0;
    for (let i = 0; i < n; i++) {
      if (speeds[i] > m) {
        m = speeds[i];
      }
      const N = levels(m);
      console.log(N);
    }


  });
});

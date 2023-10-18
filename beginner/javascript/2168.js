const fs = require('fs');
const input = fs.readFileSync('stdin', 'utf8');
const lines = input.split('\n');

const N = parseInt(lines.shift());
const cameras = new Array(N + 1);
const quadras = new Array(N);

for (let i = 0; i <= N; i++) {
  cameras[i] = lines.shift().split(' ').map(Number);
}

for (let i = 0; i < N; i++) {
  for (let j = 0; j < N; j++) {
    const camerasAtivadas = cameras[i][j] + cameras[i][j + 1] + cameras[i + 1][j] + cameras[i + 1][j + 1];
    quadras[i] = quadras[i] || [];
    if (camerasAtivadas >= 2) {
      quadras[i][j] = 'S';
    } else {
      quadras[i][j] = 'U';
    }
  }
}

for (let i = 0; i < N; i++) {
  console.log(quadras[i].join(''));
}

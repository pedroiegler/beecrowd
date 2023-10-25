const fs = require('fs');
const input = fs.readFileSync('stdin', 'utf8');
const lines = input.trim().split('\n');

const tokens = lines.shift().split(/[.-]/);

  tokens.forEach((token) => {
    console.log(token);
  });
var valores = input.split('\n');
let i = 0;
let j = 1;
let value = 0;
let temp = 0;
let temp2 = 0;

while (i <= 2) {
  if (temp2 === 0) {
    console.log(`I=${i.toFixed(0)} J=${j.toFixed(0)}`);
  } else {
    console.log(`I=${i.toFixed(1)} J=${j.toFixed(1)}`);
  }

  temp += 1;

  if (temp === 3) {
    i += 0.2;
    value += 0.2;
    j = value;
    temp = 0;
    temp2 += 1;
  }

  if (temp2 === 5) {
    temp2 = 0;
  }

  j += 1;
}

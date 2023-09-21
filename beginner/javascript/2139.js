const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', (input) => {
  const [mes, dia] = input.split(' ').map(Number);
  const diasNoMes = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 25];
  let diasFaltando;

  if (mes === 12 && dia === 25) {
    console.log('E natal!');
  } else if (mes === 12 && dia === 24) {
    console.log('E vespera de natal!');
  } else if (mes === 12 && dia > 25) {
    console.log('Ja passou!');
  } else {
    diasFaltando = diasNoMes[mes - 1] - dia;
    for (let i = mes; i < 12; i++) {
      diasFaltando += diasNoMes[i];
    }
    console.log(`Faltam ${diasFaltando} dias para o natal!`);
  }
});


const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question((numero) => {
    switch (numero) {
        case 'zero':
            console.log('0');
            break;
        case 'um':
            console.log('1');
            break;
        case 'dois':
            console.log('2');
            break;
        case 'tres':
            console.log('3');
            break;
        case 'quatro':
            console.log('4');
            break;
        case 'cinco':
            console.log('5');
            break;
        case 'seis':
            console.log('6');
            break;
        case 'sete':
            console.log('7');
            break;
        case 'oito':
            console.log('8');
            break;
        case 'nove':
            console.log('9');
            break;
        case '0':
            console.log('zero');
            break;
        case '1':
            console.log('um');
            break;
        case '2':
            console.log('dois');
            break;
        case '3':
            console.log('tres');
            break;
        case '4':
            console.log('quatro');
            break;
        case '5':
            console.log('cinco');
            break;
        case '6':
            console.log('seis');
            break;
        case '7':
            console.log('sete');
            break;
        case '8':
            console.log('oito');
            break;
        case '9':
            console.log('nove');
            break;
        default:
            break;
    }
    rl.close();
});

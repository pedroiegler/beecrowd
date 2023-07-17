var input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');

var i, j;

i = 1;
j = 60;

for(;;){

    console.log("I="+i+" J="+j);

    i = i + 3;
    j = j - 5;

    if(j < 0){
        break;
    }
}
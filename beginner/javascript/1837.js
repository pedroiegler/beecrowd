var input = require('fs').readFileSync('stdin', 'utf8');
var linhas = input.split(' ');

var a, b, c, d, e, f = 0, q, r;

a = parseInt(linhas[0]);
b = parseInt(linhas[1]);

if(a < 0){

    e = b;

    if(b < 0) 
        e = b *- 1;

    for(r = 0; r < e; r++){
        f = a - r;
        if(f % b== 0) 
            break;
    }
    q = f / b;
}else{
    q = a / b;
    r = a % b;
}

console.log(`${q} ${r}`);
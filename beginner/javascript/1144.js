const input = require('fs').readFileSync('stdin', 'utf8');

var valores = input.split('\n');

var n = parseInt(valores.shift());

var i, c, d, e, f;

for(i = 1; i <= n; i++){

    c=i*i;
    d=i*i*i;

    console.log("%d %d %d",i,c,d);

    e=c+1;
    f=d+1;
    
    console.log("%d %d %d",i,e,f);
}

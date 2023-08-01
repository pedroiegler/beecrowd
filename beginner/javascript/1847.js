var input = require('fs').readFileSync('stdin', 'utf8');
var linhas = input.split(' ');

var a, b, c;

a = parseInt(linhas[0]);
b = parseInt(linhas[1]);
c = parseInt(linhas[2]); 

if(a > b){
    if(b > c){
        if((b-c)<(a-b))
            console.log(":)");
        else 
            console.log(":(");
    }
    else 
        console.log(":)");
}
else if(b > a){
    if(c > b){
        if((c-b)<(b-a)) 
            console.log(":(");
        else
            console.log(":)");
    }
    else 
        console.log(":(");
}
else if(c > b) 
    console.log(":)");
else 
    console.log(":(");
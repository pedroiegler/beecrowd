var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split(' ');

var S, B, C;

S = parseFloat(lines[0]);
B = parseFloat(lines[1]);
C = parseFloat(lines[2]);

var sbc_time = calculate_sbc_time(S, B, C);
console.log(`${sbc_time.toFixed(3)}`);
    

function calculate_sbc_time(S, B, C){
    var rate_s = 1 / S;
    var rate_b = 1 / B;
    var rate_c = 1 / C;
        
    var rate_sbc = rate_s + rate_b + rate_c;
        
    var time_sbc = 1 / rate_sbc;
        
    return time_sbc;
}
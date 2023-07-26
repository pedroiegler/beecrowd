var i, s = 0.0, n = 100.0;

for(i = 1; i <= n; i++){
    s = s + (1.0/i);
}

console.log(s.toFixed(2));
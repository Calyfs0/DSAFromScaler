factB = 1
mod = 1000000007
for( i=1;i<=3;i++){
    factB = (factB%mod * i%mod)%mod;
    
}
console.log(factB)
console.log(Math.pow(2,factB))
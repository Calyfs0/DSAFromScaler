A = 3

console.log(PatterPrinting(A))

function PatterPrinting(A){
    farr = []
for(i = 0; i < A; i++ ){
arr = []

for(j= 0; j < A;j++){
    
    arr.push((j<=i? j+1: 0)) 
}

farr.push(arr)
}

return farr
}
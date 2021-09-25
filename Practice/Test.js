A = [1,2,3,4]

B = []

for(i=0;i<A.length;i++){
    if(i==0){
        B.push(A[A.length - 1])
    }
    else B.push(A[i+1])

}

console.log(B)
//Given array A, return an array with product of all elements except the current position
//output = [] 
A = [1,2,3,4,5,6]
D = [1,2,6,24,120,720]
C = [720,720,360,120,30,6]
output = []
for(i=0;i<A.length;i++){
    if(i==0){
        output[i] = C[i+1]
    }
    else if(i==A.length-1){
        output[i] = D[i-1]
    }
    else{
        output[i] = D[i-1] * C[i+1]
    }
}

console.log(output)












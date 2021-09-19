A = [5, 17, 100, 1]

console.log(Difference(A))
function Difference(A){
    even = Number.MIN_SAFE_INTEGER
    odd = Number.MAX_SAFE_INTEGER

    for(i = 0; i < A.length;i++){
        if(A[i]%2 == 0){
            even = Math.max(even,A[i])
        }
        else{
            odd = Math.min(A[i], odd)
        }
    }

    return even - odd

}
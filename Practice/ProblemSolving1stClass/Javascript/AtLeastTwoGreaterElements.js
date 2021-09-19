A = [11, 17, 100, 5]

console.log(AtLeastTwoGreaterElement(A))
function AtLeastTwoGreaterElement(A){
    max = A[0]
    max2 = Number.MIN_SAFE_INTEGER

    for(i = 1; i < A.length;i++){
        if(A[i]> max){
            temp = max
            max = A[i]
            max2 = temp
        }
        else if(max2 < A[i]){
            max2 = A[i]
        }
        
    }

    maxIndex = A.indexOf(max)
    A.splice(maxIndex,1)
    max2Index = A.indexOf(max2)
    A.splice(max2Index,1)

    return A
}
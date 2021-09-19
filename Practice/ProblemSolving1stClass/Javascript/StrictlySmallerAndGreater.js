A = [ 913, 440, 865, 72, 612, 445, 101, 994, 356, 91, 461, 930, 583, 448, 543, 170, 333, 107, 425, 73, 172, 416, 899, 826, 659, 561, 314, 25, 110 ]
console.log(StrictlySmallerAndGreater(A))
function StrictlySmallerAndGreater(A){

    max = Number.MIN_SAFE_INTEGER
    counter = 0
    min = Number.MAX_SAFE_INTEGER
    

    for(i = 0; i < A.length; i ++){ 
        max = Math.max(A[i],max)
        min = Math.min(A[i],min)
    }

    for(i=0;i<A.length;i++){
        if(A[i] > min && A[i] < max){
            counter++
        }
    }
    return counter

}



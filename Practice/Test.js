A = [6,4,9,6,1,4]


start = 0
end = A.length


function mergeSort(A,start,end){
    if(start>=end){
        return A
    }
    (BigInt)
    mid = start +(end-start)/2
    mergeSort(A,mid+1,end)
    mergeSort(A,start,mid-1)
}

console.log(mergeSort(A,start,end))
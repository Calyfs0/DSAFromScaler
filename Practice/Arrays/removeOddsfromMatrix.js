A = [ [1, 2, 3, 4],
[4, 5, 6, 7],
[8, 9, 10, 11],
[13, 15, 17, 19] ]

output = []
for (i=0;i<A.length;i++){
    arr = []
    for(j=0;j<A[0].length;j++){
        if(A[i][j]%2 == 0){
            arr.push(A[i][j])
        }
    }
    output.push(arr)
}

console.log(output)
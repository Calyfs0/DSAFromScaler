let A = [8, 5, 1, 10, 5, 9, 9, 3, 5, 6, 6, 2, 8, 2, 2, 6, 3, 8, 7, 2, 5, 3, 4, 3, 3, 2, 7, 9, 6, 8, 7, 2, 9, 10, 3, 8, 10, 6, 5, 4, 2, 3];
//let A = [1, 1, 1, 2, 2];
let B = 3;

function solve(A, B){
    A.sort(function(a, b){return a - b});
    if( A.length == 1) return 0;
    let i = 0;
    let j = 1;
    let count = 0;

    while(i<=A.length -2 && j<=A.length -1){
        let diff = Math.abs(A[j] - A[i]);
        if(diff == B){
            count++;
            let curr_iValue = A[i];
            let curr_jValue = A[j];
            i++;
            j++;
            while(i<j && A[i] == curr_iValue){
                i++;
            } 
            while(j<=A.length-1 && A[j] == curr_jValue) {
                j++;
            }   
        }
        else if(diff < B){
            j++;
        }
        else i++;

        if(i==j) j++;
    }

    return count;
    
}

console.log(solve(A,B));
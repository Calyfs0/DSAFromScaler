A = "scsecugqsb"

function findSubsequence(A){
    code = 26
        index = 0
        for(i=0;i<A.length-1;i++){
            curr_code = A.charCodeAt(i) - 97 
            if(curr_code < code){
                code = curr_code
                index = i
            }
        }
        second_value = A[index+1]
        code = A.charCodeAt(index+1) - 97
        for(j=index+1;j<A.length;j++){
            curr_code = A.charCodeAt(j) - 97
            if(curr_code < code){
                code = curr_code
                second_value = A[j]
            }
        }

        return A[index] + second_value
}

console.log(findSubsequence(A))
        
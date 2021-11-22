A = "mcbzcsqvouyrsq"
B = "wnqryjentzuptshyjvufcbhkcorfchzvhotqwctvgjjhmfcrsminuvabryqplqarmbsxewaumd"
C = ""
console.log(findSubsequence(A,B))
function findSubsequence(A,B){
    i = 0
        ind = B.indexOf(A[0])
        for(i=1;i<A.length;i++){
            C = B.substring(ind+1)
            if(C.includes(A[i])){
                ind += C.indexOf(A[i])
            }
            else return "NO"
        }

        return "YES"
}
A = "ebbp"
B = "qaoedpcebeaqocbacoccqoebpqdoqcpbdbqcecdoqcpebqpebbabqdpepcpbqbepbabocpc"

console.log(isPermutation(A,B))

function isPermutation(A,B){
    i=0
        count = 0
        while(i<= B.length - A.length){
            j = A.length + i
            str = ""
            isPermutation = true
            hs = {}
            for(k=i;k<j;k++){
                val = B[k]
                if (val in hs) {
                    hs[val] = hs[val] + 1
                }
                else hs[val] = 1 
            }

            for(l=0;l<A.length;l++){
                val1 = A[l]
                if(!val1 in hs){
                    isPermutation = false
                    break
                }
                else{
                    hs[val1] = hs[val1] - 1
                }

                if(hs[val1] == 0){
                    delete hs[val1]
                }
            }
            if(isPermutation){
                count += 1
            }

            i+=1
        }

        return count
}
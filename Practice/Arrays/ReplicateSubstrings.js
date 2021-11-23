function ReplicationSubstring(A,B){
    if(B.length%A != 0) return -1
        Bmap = new Map()
        for(i=0;i<B.length;i++){
            if(Bmap.get(B[i])!=undefined){
                Bmap.set(B[i],Bmap.get(B[i])+1)
            }
            else{
                Bmap.set(B[i],1)
            }
        }

        for(const value of Bmap){
            if(value % A != 0) return -1
        }

        return 1
}


A = 2
B = "abab"
console.log(ReplicationSubstring(A,B))


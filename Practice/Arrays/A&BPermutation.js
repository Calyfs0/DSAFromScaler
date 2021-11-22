A = "p"
 B = "pccdpeeooadeocdoacddapacaecb"

count = 0
Amap = new Map()
        Bmap = new Map()
        count = 0
        for(i=0;i<A.length;i++){
            A_val = A[i]
            if(Amap.get(A_val)!=undefined){
                Amap.set(A_val,Amap.get(A_val)+1)
            }
            else{
                Amap.set(A_val,1)
            }
        }
        for(c=0;c<A.length;c++){
            
                B_val = B[c]
                if(Bmap.get(B_val) != undefined){
                    Bmap.set(B_val, Bmap.get(B_val)+1)
                }
                else{
                    Bmap.set(B_val, 1)
                }
            
        }
        if(checkMaps(Amap, Bmap)){
                count+=1
            }
        for(j=1;j<B.length - A.length +1;j++){
            k = A.length - 1
            isPermutation = true
            prev_value = B[j-1]
            next_value = B[j+k]
            
            Bmap.set(prev_value, Bmap.get(prev_value)-1)
            if(Bmap.get(prev_value) ==0){
                Bmap.delete(prev_value)
            }
            if(Bmap.get(next_value)!=undefined){
                Bmap.set(next_value, Bmap.get(next_value)+1)
            }
            else{
                Bmap.set(next_value,1)
            }
            

            if(checkMaps(Amap, Bmap)){
                count+=1
            }

            
            
        }

function checkMaps(Amap,Bmap){
    for(const [key, value] of Bmap.entries()){
            if(Amap.get(key)!= undefined){
                if(Amap.get(key) != value ){
                    return false
                }
            }
            else{
                return false
            }
        }

        return true
}

console.log(count)
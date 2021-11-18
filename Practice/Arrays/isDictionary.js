A = ["fine", "none", "no"]
 B = "qwertyuiopasdfghjklzxcvbnm"

function isDictionary(A,B){
    for(i=0;i<A.length -1;i++){
        str1 = A[i]
        str2 = A[i+1]
        len1 = str1.length
        len2 = str2.length
        j = 0
    
        while(len1>0 && len2>0){
            if(B.indexOf(str1[j]) < B.indexOf(str2[j])) break
            if(B.indexOf(str1[j]) > B.indexOf(str2[j])) return 0
    
            j += 1
            len1 -= 1
            len2 -= 1
        }
    
        if(len1 > len2 && str1.indexOf(str2) >=0){
            return 0
        }
    }
    return 1
}

console.log(isDictionary(A,B))


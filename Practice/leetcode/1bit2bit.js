A = [1, 0, 0, 0]    //Answer : True
B = [1, 1, 1, 0]   //Answer false
console.log(checkValid(A))
console.log(checkValid(B))

function checkValid(bits) {
    L = bits.length
    if(L ==1) return true
    i = 0
    while(i<L-1){
        if(bits[i]==1) i+=2
        else i++
        
    }
    
    return i==L-1
        
         
    
}
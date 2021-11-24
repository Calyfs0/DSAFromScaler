A = [cat, dog, god, tca]
console.log(findAnagrams(A))
function findAnagrams(A){

    let Output = []
    let HashMap = new Map()
    let Array_index = 0
    for(let i=0;i<A.length;i++){
        A[i] = A[i].split('').sort().join('')
        
        if(HashMap.get(A[i])==undefined){
            HashMap.set(A[i],Array_index)
            let Inside_arr = []
            Inside_arr.push(i+1)
            Output.push(Inside_arr)
            Array_index +=1
        }
        else{
            let Index = HashMap.get(A[i])
            Output[Index].push(i+1)
        }
    }

    return Output
    
}
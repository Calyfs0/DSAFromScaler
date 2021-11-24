A = [cat, dog, god, tca]
console.log(findAnagrams(A))
function findAnagrams(A){

    let Output = []
    let HashMap = new Map()
    let Array_index = 0
    for(let i=0;i<A.length;i++){
        //A[i] = A[i].split(’’).sort().join(’’)
        A[i] = SortString(A[i])
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


function SortString(S){
let Max_char = 26

let Char_array = new Array(Max_char)

for(let i=0;i<26;i++){
    Char_array[i] = 0
}

for(let j=0;j<S.length;j++){
    let Index_val = S[j].charCodeAt(0) - 'a'.charCodeAt(0)
    Char_array[Index_val] +=1
}
OutputString = ""
for(let k=0;k<Char_array.length;k++ ){
    while(Char_array[k]>0){
        OutputString += k + 'a'.charCodeAt(0)
        Char_array[k] -=1
    }
}

return OutputString
}
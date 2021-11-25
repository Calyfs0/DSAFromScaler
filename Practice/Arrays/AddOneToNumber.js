A = [ 0, 6, 0, 6, 4, 8, 8, 1]
output = []
let val = Math.floor((A[A.length - 1] + 1)%10)
let carry = Math.floor((A[A.length - 1]+1)/10)
let s = val.toString()
for(let i=A.length-2;i>=0;i--){
    curr_val = Math.floor((A[i] + carry)%10)
    carry = Math.floor((A[i] + carry)/10)
    s = curr_val.toString() + s
}
if(carry == 1){
    s = carry.toString() + s
}

for(let j=0;j<s.length;j++){
    if(s[0] == 0){
        s = s.substring(1)
    }
    else break
}
for(let k =0;k<s.length;k++){
    output[k] = parseInt(s[k])
}
console.log(output)
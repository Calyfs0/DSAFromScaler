//Reverse the bits of an 32 bit unsigned integer A.


A = 3    

//Calling the function and printing it
console.log(ReverseBits(A))


///Reversing bit for an unsigned integer A
function ReverseBits(A){
    is_greater = false
    if(A == 0)
        return 0
    if(A>Math.pow(2,31)){
        A = A - Math.pow(2,31)
        is_greater = true
    }
     
    reversed_integer = 0
    
        arr_set_bits = []
        set_bits_count = 0
        while(A>0){
        if((A & (1<<0)) > 0 ){
            arr_set_bits.push(31 - set_bits_count)  
        }
        set_bits_count++
        A = (A>>1)
        }
    
        for(i = 0;i<arr_set_bits.length;i++){
        if(arr_set_bits[i] == 31){
            reversed_integer = (reversed_integer | (Math.pow(2,31)>>>0))>>>0
        }   
        else{
            reversed_integer = (reversed_integer | (1<<arr_set_bits[i])>>>0)>>>0
        }
        }
    
    if(is_greater){
        return reversed_integer + 1
    }
    else{
        return reversed_integer
    }
    


    
}



//Another solution

function ReverseBit(num){
    var revnum = 0;
  for( var i = 0; i < 32; i++ ) {
    if( num&1<<i)
      revnum |= 1<<(31-i);
  }
  return revnum>>>0;
}
//Scaler approach

/*

function (A, B) {
        let x = 0;
        for (let i = 30; i >= 0; i--) {
            if (B == 0)
                return x;
            if (((1 << i) & A) > 0) {
                x |= (1 << i);
                B--;
            }
        }

        for (let i = 0; i <= 30; i++) {
            if (B == 0)
                return x;
            if (((1 << i) & x) == 0) {
                x |= (1 << i);
                B--;
            }
        }
        return x;
    }
*/


A = 3
B = 2
console.log(findXOR(A,B))
function findXOR(A,B){
    XOR = A
    AsetBits = 0
    while(A!=0)
    {
        A = A&(A-1)
        AsetBits++
    }

    if(AsetBits == B){
        return XOR
    }
    else if(AsetBits > B){
        diff = AsetBits - B
        while(diff>0){
            XOR = XOR &(XOR -1)
            diff--
        }
        return XOR 
    }
    else{
        for(j=0;j<B-AsetBits;j++){
            i=0
            temp = XOR
        while((temp&(1<<0)) > 0){
            temp = temp>>1
            i++
        }

        XOR = XOR|(1<<i) // 1011 1010 =   0001  1011 1000 = 0011        
    }
        return XOR        
    }

}
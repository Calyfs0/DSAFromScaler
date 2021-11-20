
A = [1, 2, 3]
i = 0
mod = 1000000007
total_subarrays = (A.length * (A.length + 1))/2
ans = 0
pow = 1
console.log(calculateSubArrayOR(A))
function calculateSubArrayOR(A){
    
    while(i<=31){
        curr_total = total_subarrays
        count = 0
        bit = []
        for(j=0;j<A.length;j++)
        {
            if(!CheckBit(A[j],i))
            {
                bit.push(0)
            }
            else{
                bit.push(1)
            }
        }
        c = countOR(bit, curr_total)

        ans += (c%mod) * pow%mod
        pow = pow % mod
        pow = (pow * 2)%mod
        i += 1
    }

    return ans    
}


function CheckBit(A,i)
{
    if((A & 1<<i)> 0){
        return true
    } 
    else{
        return false
    } 
}

function countOR(bit,total_subarrays){
    count = 0
    for(j=0;j<bit.length;j++){
        if(bit[j] == 0){
            count += 1
        }
        else{
            val = (count * (count+1))/2
            total_subarrays -= val
            count = 0
        }
    }

    if(count > 0){
        val = (count * (count+1))/2
            total_subarrays -= val
    }

    return total_subarrays
}


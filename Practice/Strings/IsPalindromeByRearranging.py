class Solution:
    # @param A : string
    # @return an integer
    def solve(self, A):
        hs = set()
        for i in range(0,len(A)):
            hs.add(A[i])
            
        if len(A) == 1: return 1
        if len(A)%2 == 0:
            for val in hs:
                if A.count(val)%2 != 0:
                    return 0
            return 1
        else:
            count = 0
            for val in hs:
                if A.count(val)%2 != 0:
                    count+=1
                    if count > 1:
                        return 0
            return 1
        
            
            
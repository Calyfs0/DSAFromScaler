class Solution:
    # @param A : integer
    # @return an integer
    def findAthFibonacci(self, A):
        return getFibValue(A)
        

def getFibValue(A):
    
    if(A==0):
        return 0
    
    if(A>0 and A<=2):
        return 1
    
    return getFibValue(A-1) + getFibValue(A-2)

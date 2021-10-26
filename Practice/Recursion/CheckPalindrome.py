import sys

class Solution:
    # @param A : string
    # @return an integer
    
    sys.setrecursionlimit(10**6)
    def solve(self, A):
        return checkPalindrome(A,0,len(A)-1)
        
        
def checkPalindrome(A,s,e):
        if s>e:
            return 1
        if A[s] == A[e]:
            return checkPalindrome(A,s+1,e-1)
        else:
            return 0
    

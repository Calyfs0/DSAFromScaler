class Solution:
    # @param A : integer
    # @return an integer
    def solve(self, A):
        return fact(A)


def fact(A):
    
    if A == 0:
        return 1
    
    return fact(A-1) * A
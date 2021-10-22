class Solution:
    # @param A : list of strings
    # @param B : string
    # @return an integer
    def solve(self, A, B):
        for i in range(1,len(A)):
            min_length = min(len(A[i-1]),len(A[i]))
            for j in range(0,min_length):
                if B.index(A[i-1][j]) < B.index(A[i][j]):
                    break
                elif B.index(A[i-1][j]) > B.index(A[i][j]):
                    return 0
                elif j == min_length -1 and len(A[i-1]) > len(A[i]):
                    return 0
                
            
        return 1
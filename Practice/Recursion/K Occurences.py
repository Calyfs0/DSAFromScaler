class Solution:
    # @param A : integer
    # @param B : integer
    # @param C : list of integers
    # @return an integer
    def getSum(self, A, B, C):
        dict = {}
        sum = 0
        isElementFound = False
        for i in range(0,A):
            if dict.get(C[i]) is not None:
                dict[C[i]] = dict.get(C[i]) + 1
            else:
                dict[C[i]] = 1
                
        
        for ele in dict:
            if dict.get(ele) == B:
                isElementFound = True
                sum += ele
        
        if isElementFound:
            return sum
        
        return -1
                

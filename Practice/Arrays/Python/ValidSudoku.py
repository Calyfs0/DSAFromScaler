class Solution:
	# @param A : tuple of strings
	# @return an integer
	def isValidSudoku(self, A):
	    myset = set()

        for i in range(0,9):
            for j in range(0,9):
                curr_val = A[i][j]
                if(curr_val!= '.'):
                    if (curr_val + " rows " + str(i)) in myset or (curr_val + " columns " + str(j)) in myset or (curr_val + " box " + str(i//3) + "-" + str(j//3)) in myset:
                        return 0
                    myset.add(curr_val + " rows " + str(i))
                    myset.add(curr_val + " columns " + str(j))
                    myset.add(curr_val + " box " + str(i//3) + "-" + str(j//3))

        return 1

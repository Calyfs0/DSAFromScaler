class Solution:
	# @param A : string
	# @return a strings
    #Defining python function
    def longestPalindrome(A):
        
        if len(A) == 0:
            return 0
        if len(A) == 1:
            return A[0]
        curr_length = 1
        max_length = 1
        s_index = 0
        l_index = 0
            
        for i in range(1,len(A)):
            curr_length = 1
            p1 = i-1
            p2 = i+1
            while p1 >= 0 and p2 < len(A):
                if(A[p1] == A[p2]):
                    curr_length +=2
                    p1 -= 1
                    p2 += 1
                else:
                    break
            if max_length < curr_length:
                s_index = p1 + 1
                l_index = p2 -1
                max_length = curr_length
            if max_length == len(A):
                return A
        
        
        for i in range(0,len(A)-1):
            if A[i]!=A[i+1]:
                continue
            curr_length = 2
            if i+1 != len(A) -1:
                p1 = i-1
                p2 = i+2
                while p1 >= 0 and p2 < len(A):
                    if(A[p1] == A[p2]):
                        curr_length +=2
                        p1 -= 1
                        p2 += 1
                    else:
                        break
                if max_length < curr_length:
                    s_index = p1 + 1
                    l_index = p2 - 1
                    max_length = curr_length
                if max_length == len(A):
                    return A
            else:
                if max_length < curr_length:
                        s_index = i
                        l_index = i+1
                        max_length = curr_length 
            
        return A[s_index:l_index+1]

    #Calling python function    
    A = "aabaa"
    print(longestPalindrome(A))
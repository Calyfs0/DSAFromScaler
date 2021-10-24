A = [ "S", "c", "A", "L", "E", "r", "A", "c", "a", "D", "e", "m", "y" ]

for i in range(0,len(A)):
    if ord(A[i]) in range(97,123):
        A[i] = chr(ord(A[i])-32)
print(A)
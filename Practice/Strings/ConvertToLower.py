A = ['S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y']

for i in range(0, len(A)):
    ch = ord(A[i])
    if ch > 64 and ch < 91:
        A[i] = chr(ch + 32)
print(A)
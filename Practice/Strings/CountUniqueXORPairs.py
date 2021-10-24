A = [3, 6, 8, 10, 15, 50]
B = 5


hs = set()

count = 0
for item in A:
    xor_val = B^item
    if xor_val in hs:
        count += 1
    else:
        hs.add(item)

print(count)

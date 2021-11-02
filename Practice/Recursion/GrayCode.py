A = 3
length = pow(2,A)
output = [0]
val = 0
j = 0
for i in range(0,length-1):
    if i%2 != 0 or i == 0 or i == 1:
        val = val + (1<<j)
        j += 1
    else:
        val = val and (val-1)
    output.append(val)
print(output)



A = 2
B = 1
val = '0'
count = 1

while count<A:
    next_val = ''
    for i in range(0,len(val)):
        if val[i] == '0':
            next_val = next_val + '01'
        else:
            next_val = next_val + '10'
    val = next_val
    count+=1
        
str_val = str(val)

print(val[B-1])



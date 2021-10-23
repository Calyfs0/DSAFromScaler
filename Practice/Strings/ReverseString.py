A = "tihx dnwrmmby fa x tejuftd lrjixyiui lwvzp eymuxx"
output  = ""

final = ""
i = 0
j = len(A) -1
for i in range(0,len(A)):
    output = A[i] + output

print(A.index(' '))
print(output)

p1 = 0
p2 = 0
isLastWord = False
while(not isLastWord):
    p1 = 0
    p2 = 0
    B = ""
    if ' ' in output:
        p2 = output.index(' ')
    else:
        isLastWord = True
        p2 = len(output)
    
    for i in range(p1,p2):
        B = output[i] + B 

    final = final + B + ' '
    output = output[p2+1:]

print(final.strip())


#hv xdq op qoddptokkz vemmoxrgf ombt gg crulgzfkif
#hv xdq op qoddptokkz vemmoxrgf ombt gg crulgzfkif

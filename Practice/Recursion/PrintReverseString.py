import sys
sys.setrecursionlimit(10**6)

def reverse(s):
    if len(s) <= 1:
        return s
    
    return reverse(s[1:]) + s[0]

def main():
    # YOUR CODE GOES HERE
    # Please take input and print output to standard input/output (stdin/stdout)
    # E.g. 'input()/raw_input()' for input & 'print' for output
    
    output = reverse(s)
    print(output)
    
    return 0



if __name__ == '__main__':
    main()
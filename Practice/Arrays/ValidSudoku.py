Sudoku = ['53..7....','6..195...','.98....6.','8...6...3','4..8.3..1','7...2...6','.6....28.','...419..5','....8..79']

def isValidSudoku(S):
    myset = set()
    for i in range(0,9):
        for j in range(0,9):
            if not set.add(S[i][j] + 'found in row' + i) or not set.add(S[i][j] + 'found in column' + j) or not set.add(S[i][j] + 'found in matrix' + i/3 + '-' + j/3):
                return 'invalid'
    
    return 'valid'

print(isValidSudoku(Sudoku))
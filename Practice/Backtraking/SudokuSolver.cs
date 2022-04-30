using System;
using System.Collections.Generic;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Text;
// in this you don't have to modify the given input you just have to return the new list of string which is solution of above sudoku.
class Solution
    {
        public List<string> solve(List<string> A)
        {
            List<char[]> inputMatrix = new List<char[]>();
            for (int i = 0; i < A.Count; i++)
            {
                inputMatrix.Add(A[i].ToCharArray());
            }

            solveSudoku(inputMatrix, 0);
            for (int i = 0; i < inputMatrix.Count; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < inputMatrix[i].Length; j++)
                {
                    sb.Append(inputMatrix[i][j]);
                }

                A[i] = sb.ToString();
            }
            return A;
            
        }

        public bool solveSudoku(List<char[]> A, int cellNumber)
        {
            //if we have reached n*n cells
            //return true;

            if (cellNumber == 81)
            {
                return true;
            }

            int row = cellNumber / A.Count;
            int col = cellNumber % A.Count;
            //if the cell is a .
            if(A[row][col]!= '.')
            {
                return solveSudoku(A, cellNumber + 1);
            } 
            else
            {
                char ch = '1';
                for (int i = 1; i <= A.Count; i++,ch++)
                {
                    if (isValid(A, row, col, ch))
                    {

                        A[row][col] = ch;
                        if(!solveSudoku(A, cellNumber + 1)){
                            A[row][col] = '.';
                        }
                        else {
                            return true;
                        }
                        
                    }
                }

            }
            return false;

        }

        public bool isValid(List<char[]> A, int row, int col, char value)
        {

            int val = (int)Math.Sqrt(A.Count);
            //I am checking rows
            for (int i = 0; i < A[0].Length; i++)
            {
                if (A[row][i] == value)
                    return false;
            }
            //I am checking columns
            for (int i = 0; i < A[0].Length; i++)
            {
                if (A[i][col] == value)
                {
                    return false;
                }
            }

            //checking the box
            int rowIndex = row - row % val;
            int colIndex = col - col % val;

            for (int r = rowIndex; r < rowIndex + val; r++)
            {
                for (int c = colIndex; c < colIndex + val; c++)
                {
                    if (A[r][c] == value) return false;
                }
            }

            return true;
        }
    }



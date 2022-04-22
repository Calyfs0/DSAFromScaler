using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ScalerPractice.Trees
{
    internal class InvertBinaryTree
    {
        public TreeNode InvertTree(TreeNode A)
        {
            if (A == null)
            {
                return null;
            }

            InvertTree(A.Left);
            InvertTree(A.Right);
            TreeNode temp = A.Left;
            A.Left = A.Right;
            A.Right = temp;
            


            return A;
        }
    }
}

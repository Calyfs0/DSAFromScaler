using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ScalerPractice.Trees
{
    internal class SymmetricBinaryTree
    {
        public int IsSymmetric(TreeNode A)
        {

            return CheckBinaryTree(A.Left, A.Right) == true ? 1 : 0;
        }


        public bool CheckBinaryTree(TreeNode A, TreeNode B)
        {
            if (A == null && B == null) return true;
            if (A == null || B == null) return false;

            if (A.Value != B.Value)
            {
                return false;
            }

            return (CheckBinaryTree(A.Left, B.Right) && CheckBinaryTree(A.Right, B.Left));
        }
    }
}

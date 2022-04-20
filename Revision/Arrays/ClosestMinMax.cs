using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ScalerPractice
{
    internal class ClosestMinMax
    {
        public int solve(List<int> A)
        {
            int max = int.MinValue;
            int min = int.MaxValue;
        for (int i = 0; i < A.Count; i++)
            {
                if (A[i] > max)
                {
                    max = A[i];
                }

                if (A[i] < min)
                {
                    min = A[i];
                }
            }
            int minIndex = -1;
            int maxIndex = -1;
            int ans = int.MaxValue;
            for (int i = 0; i < A.Count; i++)
            {
                if (A[i] == min)
                {
                    minIndex = i;
                }

                if (A[i] == max)
                {
                    maxIndex = i;
                }

                if (minIndex != -1 && maxIndex != -1)
                {
                    ans = Math.Min(ans, Math.Abs(maxIndex - minIndex) + 1);
                }
            }

            return ans;


        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ScalerPractice
{
    internal class BeggarsOutsideTemple
    {
        public List<int> solve(int A, List<List<int>> B)
        {
            List<int> output = new List<int>();
            for (int i = 0; i < A; i++)
            {
                output.Add(0);
            }
            for (int i = 0; i < B.Count; i++)
            {
                int startIndex = B[i][0];
                int endIndex = B[i][1];
                int val = B[i][2];

                output[startIndex] += val;
                if (endIndex < A)
                {
                    output[endIndex] -= val;
                }
            }

            for (int i = 1; i < output.Count; i++)
            {
                output[i] = output[i - 1] + output[i];
            }

            return output;
        }
    }


}

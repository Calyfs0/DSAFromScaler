using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ScalerPractice
{
    internal class SumOfAllSubArrays
    {
        public long subarraySum(List<int> A)
        {
            long sum = 0;

            for (int i = 0; i < A.Count; i++)
            {
                sum += (long)A[i] * (i + 1) * (A.Count - i);
            }

            return sum;
        }
    }
}

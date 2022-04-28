class Solution {
    public List<List<int>> solve(List<List<int>> A, int B) {
        A.Sort(new CustomComparator());
            List<List<int>> finalOutput = new List<List<int>>();
            for (int i = 0; i < B; i++)
            {
                
                finalOutput.Add(A[i]);
            }

            return finalOutput;
    }
    class CustomComparator : IComparer<List<int>>
    {
        public int Compare(List<int> a, List<int> b)
        {
            long x1 = a[0];
            long x2 = b[0];
            long y1 = a[1];
            long y2 = b[1];

            double root1 = Math.Sqrt((x1 * x1) + (y1 * y1));
            double root2 = Math.Sqrt((double)(x2 * x2) + (y2 * y2));

            if (root1 > root2) return 1;
            if(root1 < root2) return -1;
            return 0;
        }
    }
}



package Arrays;

public class FindSumPair {
    public static int FindSum(ArrayList<Integer> A, int B)
	{
		for(int i = 0; i <A.size();i++)
        {
            for(int j = i+1;j<A.size();j++)
            {
                if(A.get(i) + A.get(j) == B)
                {
                    return 1;
                }
            }
        }
        return 0;
	}
}

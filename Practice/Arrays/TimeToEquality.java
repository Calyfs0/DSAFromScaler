package Arrays;

public class TimeToEquality {
    public int solve(ArrayList<Integer> A) {
        
        int max = A.get(0);
        for (int x: A)
        {
            if(max < x)
            {
                max = x;
            }
        }
        
        int output = 0;
        for( int i: A)
        {
            output = output +(max - i);
        }
        
        return output;
    }
}

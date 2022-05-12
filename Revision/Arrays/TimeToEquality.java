public class  TimeToEquality {
    int[] A = {2, 4, 1, 3, 2}; 
    public int CalculateTotalTime(int[] A){
        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0;i<A.length;i++){
            if(A[i] > max){
                max = A[i];
            }

            currentSum += A[i];

        }

        //if all element become max, total sum = max * length of array
        //So time taken will be total sum - current sum

        return max * A.length - currentSum;
    }
    
}



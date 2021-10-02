package Arrays;

public class LowestAverageSubarray {
    public static void findLargestAverageIndex()
	{
		int[] A = { 20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11 };
		int B = 9;
		double sum = 0;
		int index = 0;
		for(int i=0;i<B;i++){
			sum += A[i];
		}
		double avg = sum/B;

		for(int i =1; i <= A.length-B;i++){
			int j = i+B-1;
			sum = sum - A[i-1];
			sum = sum + A[j];

			if(sum/B < avg){
				index = i;
				avg = sum/B;
			}
		}

		System.out.println(index);

	}
}

import java.util.ArrayList;

public class SubArrayWithLeastAverage {
    ArrayList<Integer> A;
    int B;

    public SubArrayWithLeastAverage(ArrayList<Integer> A, int B) {
        this.A = A;
        this.B = B;
    }

    public int GetFirstIndexOofLeastAverageSubArray() {
        int minSum = 0;

        int outputIndex = 0;

        for (int i = 0; i < B; i++) {
            minSum += A.get(i);
        }

        int currentSum = minSum;

        for (int i = B; i < A.size(); i++) {
            currentSum -= A.get(i - B);
            currentSum += A.get(i);
            if (currentSum < minSum) {
                minSum = currentSum;
                outputIndex = i - B + 1;
            }
        }

        return outputIndex;
    }
}

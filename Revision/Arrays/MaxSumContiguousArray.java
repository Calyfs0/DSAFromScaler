import java.util.ArrayList;

import java.util.List;

public class MaxSumContiguousArray {
    List<Integer> input;

    public MaxSumContiguousArray(List<Integer> input) {
        this.input = input;
    }

    public int CalculateMaxContiguousSum() {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < input.size(); i++) {
            currentSum += input.get(i);
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}

import java.util.ArrayList;
import java.util.List;

public class MaxMinWithMinimumComparison {
    public int solve() {
        ArrayList<Integer> A = new ArrayList<Integer>(
                List.of(1, 3, 4, 1));
        Node output = GetMinMax(A, 0, A.size() - 1);
        return output.min + output.max;

    }

    public Node GetMinMax(ArrayList<Integer> A, int low, int high) {
        Node minMax = new Node();
        Node leftMinMax;
        Node rightMinMax;
        if (low == high) {
            int val = A.get(low);
            minMax.min = val;
            minMax.max = val;
            return minMax;
        }

        if (high == low + 1) {
            int lowVal = A.get(low);
            int highVal = A.get(high);

            if (lowVal > highVal) {
                minMax.min = highVal;
                minMax.max = lowVal;
            } else {
                minMax.min = lowVal;
                minMax.max = highVal;
            }

            return minMax;
        }

        int mid = (high + low) / 2;
        leftMinMax =

                GetMinMax(A, low, mid);
        rightMinMax = GetMinMax(A, mid + 1, high);

        minMax.min = Math.min(rightMinMax.min, leftMinMax.min);

        minMax.max = Math.max(rightMinMax.max, leftMinMax.max);

        return minMax;

    }

    public class Node {
        public int min;
        public int max;
    }
}

// struct node
// {
// int min;
// int max;
// };

// struct node getMinMax(vector<int> &A, int low, int high){
// struct node minmax, mml, mmr;
// int mid;

// /* If there is only on element */
// if (low == high){
// minmax.max = A[low];
// minmax.min = A[low];
// return minmax;
// }

// /* If there are two elements */
// if (high == low + 1){
// if (A[low] > A[high]){
// minmax.max = A[low];
// minmax.min = A[high];
// }
// else{
// minmax.max = A[high];
// minmax.min = A[low];
// }
// return minmax;
// }

// /* If there are more than 2 elements */
// mid = (low + high)/2;
// mml = getMinMax(A, low, mid);
// mmr = getMinMax(A, mid+1, high);

// /* compare minimums of two parts*/
// if (mml.min < mmr.min)
// minmax.min = mml.min;
// else
// minmax.min = mmr.min;

// /* compare maximums of two parts*/
// if (mml.max > mmr.max)
// minmax.max = mml.max;
// else
// minmax.max = mmr.max;

// return minmax;
// }

// int Solution::solve(vector<int> &A) {
// int n = A.size();
// struct node ans = getMinMax(A, 0, n-1);
// int res = ans.max + ans.min;
// return res;
// }

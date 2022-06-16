import java.util.*;

public class CombinationSumII {

    public static void main(String[] args) {
        CombinationSumII combinationSumII = new CombinationSumII();
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(10, 1, 2, 7, 6, 1, 5));
        int B = 8;
        ArrayList<ArrayList<Integer>> finalOutput = combinationSumII.combinationSum(A, B);

        for (ArrayList<Integer> output : finalOutput) {
            System.out.println(output.toString());
        }

    }

    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        ArrayList<Integer> currentOutput = new ArrayList<>();
        ArrayList<ArrayList<Integer>> finalOutput = new ArrayList<>();
        Collections.sort(A);
        solve(0, A, B, currentOutput, finalOutput, 0);
        return finalOutput;
    }

    public void solve(int i, ArrayList<Integer> A, int B, ArrayList<Integer> currentOutput,
            ArrayList<ArrayList<Integer>> finalOutput, int sum) {

        if (i == A.size()) {
            if (sum == B && !finalOutput.contains(currentOutput)) {
                finalOutput.add(new ArrayList<>(currentOutput));
            }
            return;
        }

        int currentElement = A.get(i);
        sum += currentElement;
        currentOutput.add(currentElement);

        solve(i + 1, A, B, currentOutput, finalOutput, sum);

        sum -= currentElement;
        currentOutput.remove(currentOutput.size() - 1);
        solve(i + 1, A, B, currentOutput, finalOutput, sum);
    }
}

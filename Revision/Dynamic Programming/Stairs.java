public class Stairs {
    public static void main(String[] args) {
        Stairs stairs = new Stairs();
        int A = 4;
        System.out.println(stairs.climbStairs(A));
    }

    public int climbStairs(int A) {
        int[] climbWaysForSteps = new int[A + 1];
        for (int i = 0; i < climbWaysForSteps.length; i++) {
            climbWaysForSteps[i] = -1;
        }

        return noOfWays(A, climbWaysForSteps);
    }

    public int noOfWays(int A, int[] climbWaysForSteps) {
        if (A == 0)
            return 1;
        if (A <= 3)
            return A;
        if (climbWaysForSteps[A] != -1)
            return climbWaysForSteps[A];
        climbWaysForSteps[A] = noOfWays(A - 1, climbWaysForSteps) + noOfWays(A - 2, climbWaysForSteps);

        return climbWaysForSteps[A];

    }
}
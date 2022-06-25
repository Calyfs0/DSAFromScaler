import java.util.Arrays;

public class LetsParty {
    public static void main(String[] args) {
        LetsParty letsParty = new LetsParty();
        int A = 5;
        int[] numberOfWaysArray = new int[A + 1];
        Arrays.setAll(numberOfWaysArray, i -> {
            return -1;
        });
        int mod = 10003;
        System.out.println(letsParty.numberOfWaysToParty(A, numberOfWaysArray, mod));
    }

    public int numberOfWaysToParty(int A, int[] numberOfWaysArray, int mod) {
        if (A < 3)
            return A;
        if (numberOfWaysArray[A] != -1)
            return numberOfWaysArray[A];
        numberOfWaysArray[A] = numberOfWaysToParty(A - 1, numberOfWaysArray, mod)
                + ((A - 1) * numberOfWaysToParty(A - 2, numberOfWaysArray, mod)) % mod;
        return numberOfWaysArray[A] % mod;
    }
}

public class ReverseBits {
    public long reverse(long a) {
        int[] bit_array = new int[32];

        for (int i = 0; i < 32; i++) {
            if ((a & (1 << i)) > 0) {
                bit_array[i] = 1;
            }
        }
        long output = 0;
        for (int i = 0; i < bit_array.length; i++) {
            if (bit_array[i] == 1) {
                output += ((long) 1 << (31 - i));
            }
        }

        return output;
    }
}

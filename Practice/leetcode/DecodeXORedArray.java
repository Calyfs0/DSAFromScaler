public class DecodeXORedArray {
    public int[] decode(int[] encoded, int first) {
        int[] output = new int[encoded.length + 1];

        output[0] = first;

        for (int i = 0; i < encoded.length; i++) {
            output[i + 1] = output[i] ^ encoded[i];
        }

        return output;
    }
}

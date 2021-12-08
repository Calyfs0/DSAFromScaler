class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            while (indices[i] != i) {
                int index = indices[i];

                char temp_char = arr[index];
                arr[index] = arr[i];
                arr[i] = temp_char;

                int temp = indices[index];
                indices[index] = indices[i];
                indices[i] = temp;

            }
        }

        return new String(arr);
    }

}
class NumberOfBits {
    public NumberOfBits() {
        int A = 15;
        int count = 0;
        while (A > 0) {
            count++;
            A = A & (A - 1);
        }

        System.out.println(count);
    }
}
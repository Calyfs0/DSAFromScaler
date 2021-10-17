class ExcelColumnToNumber {
    public int titleToNumber(String A) {
        int col_index = 0;
        int pow = 0;
        for (int i = A.length() - 1; i >= 0; i--) {
            col_index += ((int) A.charAt(i) - 'A' + 1) * Math.pow(26, pow);
            pow++;
        }
        return col_index;
    }
}
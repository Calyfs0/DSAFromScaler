public class OperationsInArray {
    public static void StringOperations() {
        String[] operations = {"--X", "X++", "X++"};
        int X = 0;

        for (String input : operations) {
            switch (input) {
                case ("--X") -> --X;
                case ("++X") -> ++X;
                case ("X--") -> X--;
                case ("X++") -> X++;
            }
        }

        System.out.println(X);
    }
}

public class PowerFunction{
    public static void main(String[] args) {
        PowerFunction powerFunction = new PowerFunction();
        int A = 2;
        int B = 3;
        int C = 3;
        System.out.println(powerFunction.pow(A, B, C));
    }

    public int pow(int A, int B, int C){
        if(A == 0) return 0;
        if(B == 0) return 1;

        long currentValue = pow(A,B/2,C);

        long output = (currentValue%C * currentValue%C)%C;

        if(B%2!=0){
            output = (output * A)%C;
        }

        if(output < 0){
            output += C;
        }

        return (int)output;
    }
}
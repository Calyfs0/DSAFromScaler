public class FizzBuzz {
    public String[] PrintFizzBuzz(int A){
        String[] output = new String[A];
        for(int i=1;i<=A;i++){
            String s = "";
            if(i%3 == 0) s += "Fizz";
            if(i%5 == 0) s += "Buzz";
            if(s.equals("")){
                output[i-1] = Integer.toString(i);
            }
            else{
                output[i-1] = s;
            }
        }

        return output;
    }
    
}

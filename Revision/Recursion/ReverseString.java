public class ReverseString {
    public static void main(String[] args) {
        String s = "scaleracademy";
        System.out.println(ReverseString.reverseString(s));
    }

    public static String reverseString(String s){
        if(s.length() == 1) return s;

        return reverseString(s.substring(1)) + s.charAt(0);
    }
}

public class Solution {
    public int colorful(int A) {
        if (A <10) return 1;

        HashSet<Integer> hs = new HashSet<Integer>();

        String s = Integer.toString(A);

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                int val = Integer.parseInt(s.substring(i,j));
                int mul = 1;

                while(val>0){
                    mul = mul * (val%10);
                    val = val/10;
                }

                if(hs.contains(mul)){
                    return 0;
                }
                hs.add(mul);

            }
        }

        return 1;

    }
}

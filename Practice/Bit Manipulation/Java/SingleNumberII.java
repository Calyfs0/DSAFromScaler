import java.util.List;
import java.util.ArrayList;

public class SingleNumberII {

    public static void main(String[] args) {
        List<Integer> A = new ArrayList<Integer>(List.of(1,1,1,2,2,2,3,3,3,4));
        SingleNumberII sn = new SingleNumberII();
        System.out.println(sn.singleNumber(A)) ;
    }
    public  int singleNumber(final List<Integer> A) {
        int ans = 0;

        for(int i=0;i<32;i++){
            int count = 0;
            for(int j=0;j<A.size();j++){
                int currentValue = A.get(j);

                if((currentValue & (1<<i)) > 0){
                    count++;
                }
            }

            if(count%3!=0){
                ans |= 1<<i;
            }
        }

        return ans;
    }
}

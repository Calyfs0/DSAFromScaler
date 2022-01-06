public class SqrtOfInteger {
    public int sqrt(int A) {
        int l = 0;
        int r = Math.min(A,1000000000);
        int mid = (l+r)/2;
        int output = 0;
        while(l<=r){
            long prod = (long)mid*mid;
            if(prod == A){
                return mid;
            }
            else if(prod>A){
                r = mid-1;
            }
            else{
                output = mid;
                l = mid+1;
            } 
            mid = (l+r)/2;
        }

        return output;
    }
}

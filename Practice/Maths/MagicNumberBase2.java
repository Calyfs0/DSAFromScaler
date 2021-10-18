public class MagicNumberBase2 {
    public static void NthMagicNumber() {
		int N = 10;
		int pow = 1;
		int ans = 0;
		
		while(N>0) {
			if((N & 1) == 1) {
				ans += Math.pow(5, pow);
			}
			pow++;
			N = N>>1;
		}
		
		System.out.println(ans);
		
	}
}

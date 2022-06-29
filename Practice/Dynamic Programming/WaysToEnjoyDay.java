package Strings;

import java.util.Arrays;

public class Solution {
    int prevDayPizza , prevTvDay, prevPrevTvDay;
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solve(3));
    }
    public  int solve(int A) {
        int[] dp = new int[A+1];
        prevDayPizza = 1;
        prevTvDay = 1;
        prevPrevTvDay = 0;
        Arrays.fill(dp,-1);

        return noOfWays(A,dp);
    }

    public  int noOfWays(int i, int[] dp){

        if(i == 1){
            return 3;
        }

        if(dp[i]!= -1) return dp[i];
        int ways = noOfWays(i-1,dp);
        int sleep = ways;
        int pizza = ways - prevDayPizza;
        prevDayPizza = pizza;
        int tv = ways - prevTvDay - prevPrevTvDay;
        int temp = prevTvDay;
        prevTvDay = tv;
        prevPrevTvDay = 2*temp;

        dp[i] = sleep + pizza + tv;
        return dp[i];
    }
}


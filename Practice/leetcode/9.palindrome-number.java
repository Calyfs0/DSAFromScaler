/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        int newNum = 0;
        int xCopy = x;

        while(xCopy > 0){
            newNum = newNum*10 + xCopy%10;
            xCopy = xCopy/10;
        }

        return x == newNum;
    }
}
// @lc code=end


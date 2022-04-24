public class Solution {
    public bool IsValid(string s) {
        Stack<char> stack = new();
        for (int i = 0; i < s.Length; i++) {
            if ((s[i] == '(') || (s[i] == '{') || (s[i] == '['))
            {
                stack.Push(s[i]);
            }
            else if(stack.Count == 0) return false;
            else {
                char c = stack.Pop();
                if ((s[i] == ')') && (c != '(')) {

                        return false;

                }
                else if ((s[i] == '}') && (c != '{'))
                {
                        return false; 
                }
                if ((s[i] == ']') && (c != '['))
                {
                        return false;
                }
            }
        }
        
        if(stack.Count > 0) return false;
        
        return true;
        
    }
}
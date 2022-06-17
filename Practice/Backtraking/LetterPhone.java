import java.util.*;
public class LetterPhone {
    public ArrayList<String> letterCombinations(String A) {
        HashMap<String,String> hm = new HashMap<>();
        hm.put("1","1");
        hm.put("2","abc");
        hm.put("3","def");
        hm.put("4","ghi");
        hm.put("5","jkl");
        hm.put("6","mno");
        hm.put("7","pqrs");
        hm.put("8","tuv");
        hm.put("9","wxyz");
        hm.put("0","0");
        ArrayList<String> output = new ArrayList<>();
        String current = "";
        solve(0,A,output,current,hm);
        return output;

        
    }

    public void solve(int i, String A, ArrayList<String> output, String current,HashMap<String,String> hm){
        if(i == A.length()){
            output.add(current);
            return;
        }

        String currentString = Character.toString(A.charAt(i));
        String combinationString = hm.get(currentString);

        for(int j=0;j<combinationString.length();j++){
            current += combinationString.charAt(j);
            solve(i+1,A,output,current,hm);
            current = current.substring(0,current.length()-1);
        }
    }

    
}

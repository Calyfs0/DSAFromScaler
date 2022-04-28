//DP
//Optimal substructure
//Memoization
string input = "adfdfdfsss";
string pattern = "ad*?ss"; 
//0 for no match, 1 for match, -1 for not calculated
int[][] arr = new int[s1.length+1][s2.length+1]; //populate it with -1
REM(input, pattern, s1.length, s2.length);
int REM(string s1, string s2, int l1, int l2){
        //base conditions
        if(l1 == 0 && l2 == 0) return true;
        if(l2 ==0 && l1!=0) return false;
        if(l2 !=0 && l1==0){
            if (arr[l1][l2]!= -1) return arr[l1][l2];
            arr[l1][l2] = REM(s1,s2,l1,l2-1) && s2[l2-1] == "*";
            return arr[l1][l2];
        }  

        if (arr[l1][l2]!= -1) return arr[l1][l2];
        //when characters matches or there is a "?"
        if((s1[l1-1] == s2[l2-1]) || s2[l2-1] == "?"){
            arr[l1][l2] = REM(s1,s2,l1-1,l2-1);
            
        }

        else if(s2[l2-1] == "*"){
            arr[l1][l2] = REM(s1,s2,l1-1,l2) || REM(s1,s2,l1,l2-1); //convert bool to int if it's not implicit
        }
        else{
            arr[l1][l2] = 0;
        }

        return arr[l1][l2];
}   
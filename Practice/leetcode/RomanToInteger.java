public int romanToInt(String s){

        int sum=0;
        for(int i=s.length()-1;i>=0;i--){

        int val=0;

        switch(s.charAt(i)){
        case'I':
        val=1;
        break;
        case'V':
        val=5;
        break;
        case'X':
        val=10;
        break;
        case'L':
        val=50;
        break;
        case'C':
        val=100;
        break;
        case'D':
        val=500;
        break;
        case'M':
        val=1000;
        break;
default:
        break;
        }

        if(val*4<sum){
        sum-=val;
        }
        else{
        sum+=val;
        }

        }

        return sum;

        }
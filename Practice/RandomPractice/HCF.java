package RandomPractice;

public class FindHCF {

    FindHCF(int num1, int num2)
	{
		
		int HCF = 1;
		
		for(int i = 2;i <= Math.sqrt(Math.max(num1, num2));i++)
		{
			if(num1%i == 0 && num2%i==0)
			{
				HCF *= i;
				num1 = num1/i;
				num2 = num2/i;
				i = 1;
			}
		}
		
		System.out.println(HCF);
	}
    
}

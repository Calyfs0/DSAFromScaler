package Arrays;

public class RotationGame {

    RotationGame(int[] A, int B)
	{	
		for(int i = 0; i < A.length;i++)
		{
			System.out.print(A[(A.length+i-B)%A.length] + " ");
		}
	}
}


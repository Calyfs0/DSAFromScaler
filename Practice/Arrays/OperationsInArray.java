package Arrays;

public class OperationsInArray {
    public static void StringOperations()
	{
		String[] operations = {"--X","X++","X++"};
		int X = 0;
		
		for(int i=0;i<operations.length;i++) {
			String input = operations[i];
			switch(input) {
			case ("--X"):
				--X;
				break;
			case ("++X"):
				++X;
				break;
			case ("X--"):
				X--;
				break;
			case ("X++"):
				X++;
				break;
			}
		}
		
		System.out.println(X);
	}
}

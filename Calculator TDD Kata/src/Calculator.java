
public class Calculator {

	public int Add(String input) 
	{
		String[] numbers = input.split(",");
		if(input.isEmpty())
		{
			return 0;
		}
		else if(numbers.length > 1)
		{
			return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
		}
		else
			return Integer.parseInt(numbers[0]);
	}
	
	

}

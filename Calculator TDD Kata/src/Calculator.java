
public class Calculator {

	public int calculate(String input) 
	{
		// TODO Auto-generated method stub
		if(isEmpty(input))
		{
			return 0;
		}
		return stringToInt(input);
	}
	
	private int stringToInt(String input)
	{
		return Integer.parseInt(input);
	}
	private boolean isEmpty(String input)
	{
		return input.isEmpty();
	}

}

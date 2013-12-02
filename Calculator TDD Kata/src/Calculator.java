
public class Calculator {

	public int Add(String input) 
	{
		String[] numbers = input.split(",");
		int i, result=0;
		
		if(input.isEmpty())
		{
			return 0;
		}
		else if(numbers.length > 1)
		{
			for(i=0; i<numbers.length; i++)
			{
				result +=Integer.parseInt(numbers[i]);
			}
			return result;
		}
		else
			return Integer.parseInt(numbers[0]);
	}
	
	

}

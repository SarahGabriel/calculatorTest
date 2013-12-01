import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculateTest 
{
	private Calculator calculator;
	
	public void init()
	{
		calculator = new Calculator();
	}
	@Test
	public void emptyString()
	{
		//Calculator calculator = new Calculator();
		int result = calculator.calculate("");
		assertEquals(0, result);
		
	}
	
	public void returnSingleValue()
	{
		//Calculator calculator = new Calculator();
		int result1 = calculator.calculate("1");

		assertEquals(1, result1);
	}

}

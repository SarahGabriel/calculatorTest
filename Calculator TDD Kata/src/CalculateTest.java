import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculateTest 
{
	private Calculator calculator = new Calculator();
	
	
	@Test
	public void emptyString()
	{
		int result = calculator.calculate("");
		assertEquals(0, result);
		
	}
	
	@Test
	public void returnSingleValue()
	{
		//init();
		Calculator calculator = new Calculator();
		int result1 = calculator.calculate("1");

		assertEquals(0, result1);
	}

}

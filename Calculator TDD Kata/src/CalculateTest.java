import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculateTest 
{
	private Calculator calculator = new Calculator();
	
	
	@Test
	public void emptyString()
	{
		int result = calculator.Add("");
		assertEquals(0, result);
		
	}
	
	@Test
	public void returnSingleValue()
	{
		int result1 = calculator.Add("1");
		assertEquals(1, result1);
	}
	
	@Test
	public void returnTwoValues()
	{
		int result = calculator.Add("1,2");
		assertEquals(3, result);
	}

}

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculateTest 
{
	@Test
	public void emptyString()
	{
		Calculator calculator = new Calculator();
		int result = calculator.calculate("");
		assertEquals(result, 0);
		
	}

}

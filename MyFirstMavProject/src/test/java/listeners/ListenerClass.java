package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ListenerClass 
{
	@Test
	public void testThatIsSkipped()
	{
		throw new SkipException ("This is the SkippedTest method");
		
	}
	
	@Test
	public void failedTest()
	{
		Assert.assertFalse(true);
		System.out.println("Skipped method");
		
	}
	
	
	
	
}

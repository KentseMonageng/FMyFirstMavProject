package loans;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class PersonalLoan2 
{
	@Test(groups= {"Premium"})
	public void PL2_Loan1()
	{
		System.out.println("First PersonalLoan2 test");
	}
	
	
	@Test
	public void skippedTest()
	{
		throw new SkipException("This is the Skippedtest");
	}
	
	@Test
	public void failedTest()
	{
		Assert.assertTrue(false);
	}
	
	
	@Test
	
	public void PL2_Loan2()
	{
		System.out.println("Second PersonalLoan2 test");
	}
}

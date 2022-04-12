package loans;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Personalloan1 
{
	@Parameters(("URL"))
	@Test(groups= {"Premium"})
	public void PL1_Loan1()
	{
		System.out.println("First PersonalLoan1 test");
	}
	@Test
	
	public void PL1_Loan2()
	{
		System.out.println("Second PersonalLoan1 test");
	}
}

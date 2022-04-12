package loans;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class HomeLoan1 
{
	
	@BeforeSuite
	public void GlobalVariables()
	{
		System.out.println("Set Global variables before we start");
	}
	
	@BeforeTest
	@AfterTest
	public void cleanDB()
	{
		System.out.println("Clean Database at this stage");
	}
	
	@Test
	public void HL1_Loan1()
	{
		System.out.println("First HomeLoan1 test");
	}
	@BeforeMethod
	public void checkSystemHealthBefore()
	{
		System.out.println("Check System health BEFORE every test");
	}
	
	@AfterMethod
	public void checkSystemHealthAfter()
	{
		System.out.println("Check System Health After every test");
	}
	
	@Test(groups= {"Premium"})
	
	public void HL1_Loan2()
	{
		System.out.println("Second HomeLoan1 test");
	}
}

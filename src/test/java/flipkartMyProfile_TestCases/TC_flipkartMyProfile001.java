package flipkartMyProfile_TestCases;
import org.junit.Assert;
import org.testng.annotations.Test;

import flipkartMyProfile_PageObject.LoginPage;
import flipkartMyProfile_PageObject.MyAccountPage;

public class TC_flipkartMyProfile001 extends BaseClass{

	@Test
	 public void MainLoginpage() throws InterruptedException
	 {
		
		LoginPage lp=new LoginPage(driver);//for getting life add driver to the string
		MyAccountPage ap =new MyAccountPage(driver);
	//	Thread.sleep(3000);
		lp.setemail(email);
		logger.info("email is entered");
		lp.setPassword(password);
		logger.info("password is entered");
		lp.loginbutton();
		logger.info("login is successfully");
	
		
		String title=driver.getTitle();
		System.out.println(title);
	//	Thread.sleep(5000);
		if(driver.getTitle().equals(title))
		{
		
			logger.info("title is matched");
			Assert.assertTrue(true);
		}
	     else
		{
			Assert.assertFalse(false);
		}
		ap.Myaccount().click();
		ap.Myaccount().click();
		ap.logoutbutton();
		logger.info("logout is successful in 1st test case");
	 }
	

}

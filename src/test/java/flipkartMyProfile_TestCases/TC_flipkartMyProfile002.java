package flipkartMyProfile_TestCases;

import org.testng.annotations.Test;

import flipkartMyProfile_PageObject.LoginPage;
import flipkartMyProfile_PageObject.MyAccountPage;

public class TC_flipkartMyProfile002 extends BaseClass{
	
	@Test
	public void profileinfo() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);//login details
	//	Thread.sleep(3000);
		lp.setemail(email);
		logger.info("email is entered");
		lp.setPassword(password);
		logger.info("password is entered");
		lp.loginbutton();
		logger.info("login is successfully");
	//	Thread.sleep(3000);
		MyAccountPage ap =new MyAccountPage(driver);//my account details is entered
		Thread.sleep(3000);
		ap.Myaccount().click();
		ap.Myaccount().click();
		logger.info("my account is clicked");
	//	Thread.sleep(3000);
		ap.myprofile();
		logger.info("myprofile is clicked");
		ap.PersonalEdit();
		logger.info("name is cleared");
		ap.FirstNameclear();
		logger.info("personal edit button");
		ap.FirstName("Ganesh");
		logger.info("personal first name enter");
		logger.info("last name is clear");
		ap.lastnameclear();
		ap.lastnameEnter("babu");
		logger.info("personal last name is entered");
		ap.EnterGender();
		logger.info("gender is selected");
		ap.Save();
		logger.info("saved details");
		//ap.editemail();
	//	Thread.sleep(5000);
		logger.info("Email is edited");
		//ap.Email("lovesganesh8@gmail.com");
		logger.info("email is entered");
		//ap.EmailSaved();
		logger.info("email is saved");
		ap.Myaccount().click();
		ap.Myaccount().click();
		ap.logoutbutton();
		logger.info("logout is successfull for 2nd testcases");
		
		
		
		
		
		
		
		
	}

}

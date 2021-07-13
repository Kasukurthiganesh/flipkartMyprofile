package flipkartMyProfile_TestCases;

import org.testng.annotations.Test;

import flipkartMyProfile_PageObject.LoginPage;
import flipkartMyProfile_PageObject.MyAccountPage;
import flipkartMyProfile_PageObject.MyAddressDetails;

public class TC_flipkartMyProfile003 extends BaseClass{
	@Test
	public void myprofileadress() throws InterruptedException
	{
		LoginPage lp =new LoginPage(driver);       //Login details is Enter
		MyAccountPage ap=new MyAccountPage(driver);//MyAccountPage is clicked
		MyAddressDetails mad=new MyAddressDetails(driver);//myAddress place is clicked
	//	Thread.sleep(3000);
		lp.setemail(email);   	                logger.info("email is entered");
		lp.setPassword(password);               logger.info("password is entered");
		lp.loginbutton();                       logger.info("login is successfully");
		Thread.sleep(3000);
		ap.Myaccount().click();
		ap.Myaccount().click();                 logger.info("my account is clicked");
		Thread.sleep(3000);
		ap.myprofile();                         logger.info("myprofile is clicked");
		mad.addressmanagelink();                logger.info("my address link is clicked");
		Thread.sleep(5000);
		mad.addressbutton();	                logger.info("Add Address button is clicked");//@FindBy method is used
		mad.EditName().sendKeys("Ganesh");      logger.info("name is added to address box");//@By.method is used
		mad.newphoneno("7780227032");           logger.info("New Phone nummber added");
		mad.pincodeEnter("500024");             logger.info("Pincode is added");
		mad.localityenter("Sanath nagar");      logger.info("locality is added");
		mad.addressdetails("Srt1138,"
		+ "Erragada,near neelima hosptial");    logger.info("address is added");
		Thread.sleep(3000);
		mad.cityname("Hyderbad");               logger.info("cityName is added");
		mad.statename();                        logger.info("stateName is searched");
		mad.stateselection();                   logger.info("stateName is selected");
		mad.landmark("near neelima hosptil");   logger.info("landmark is added");
	    mad.alternatephno("9441139192");        logger.info("AlternatePhone number is added");
	    mad.addresstypeselect();                logger.info("type of address is selected home");
	    mad.cancelbutton();                     logger.info("cancel all detailes");
        ap.Myaccount().click();
		ap.Myaccount().click();
	    ap.logoutbutton();                      logger.info("logout is successful for 3rd testcase");
	    
		
		
		
		
	}

}

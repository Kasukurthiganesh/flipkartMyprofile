package flipkartMyProfile_TestCases;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import flipkartMyProfile_PageObject.AddToCart;
import flipkartMyProfile_PageObject.LoginPage;
import flipkartMyProfile_PageObject.MyAddressDetails;

//import flipkartMyProfile_PageObject.AddToCart;

public class TC_flipkartMyProfile004 extends BaseClass {
	@Test
	public void Addtocart() throws InterruptedException
	{
	AddToCart ac=new AddToCart(driver);
	LoginPage lp=new LoginPage(driver);
	MyAddressDetails mad=new MyAddressDetails(driver);
	
	lp.setemail(email);                       logger.info("email is entered");   
	lp.setPassword(password);                 logger.info("password is entered");
	lp.loginbutton();                         logger.info("login is successfully");
	ac.Searchforproduct("Mobiles"+Keys.ENTER);logger.info("Search for product entered");
/*	WebElement Mobiles=ac.Searchforproduct("Mobiles"); logger.info("searched");
	a.moveToElement(Mobiles).click().perform(); Actions a =new Actions(driver);   */     
	Thread.sleep(3000);
	ac.minPriceButtonclick();                 logger.info("minPriceButtonclick clicked");
	ac.minamountclicked();                    logger.info("minamountclicked clicked");
	Thread.sleep(2000);
	ac.maxmButtonclicked();                   logger.info("maxmButtonclicked clicked");
	ac.maxmAmountclicked();                   logger.info("maxmAmountclicked clicked");
	Thread.sleep(2000);
	ac.RAMclicked();                          logger.info("RAMclicked clicked");
	ac.phonemoresearched();                   logger.info("28+more");
	Thread.sleep(2000);
	ac.mobilephnoeclicked();                  logger.info("mobilephnoeclicked clicked");
	Thread.sleep(2000);
	ac.Ratingclicked();                       logger.info("Ratingclicked clicked");
	Thread.sleep(2000);
	ac.internalStoragebutton();               logger.info("internalStoragebutton clicked");
	ac.internalStorageclicked();              logger.info("internalStorageclicked clicked");
	Thread.sleep(2000);
	ac.Batterybuttonclicked();                logger.info("Batterybuttonclicked clicked");
	ac.Batterycapicityclicked();              logger.info("Batterycapicityclicked clicked");
	Thread.sleep(2000);
	ac.operationsystemclicked();              logger.info("operationsystemclicked clicked");
	ac.Androidclicked();                      logger.info("Androidclicked clicked");
	Thread.sleep(2000);
	ac.VivoPhoneClicked();                    logger.info("VivoPhoneClicked clicked");
	Thread.sleep(5000);
	Set<String> handels=driver.getWindowHandles();
	Iterator<String>it=handels.iterator();
	String Parentwindows=it.next();
    String childWindows=it.next();
	driver.switchTo().window(Parentwindows);
	driver.switchTo().window(childWindows);
	ac.AddToCartbuttonclicked();              logger.info("AddToCartbuttonclicked clicked");
	ac.placeanOrder();                        logger.info("placeanOrder clicked");
	mad.EditName().sendKeys("Ganesh");      logger.info("name is added to address box");//@By.method is used
	mad.newphoneno("7780227032");           logger.info("New Phone nummber added");
	mad.pincodeEnter("500024");             logger.info("Pincode is added");
	mad.localityenter("Sanath nagar");      logger.info("locality is added");
	mad.addressdetails("Srt1138,"
	+ "Erragada,near neelima hosptial");    logger.info("address is added");
	mad.cityname("Hyderbad");               logger.info("cityName is added");
	mad.statename();                        logger.info("stateName is searched");
	mad.stateselection();                   logger.info("stateName is selected");
	mad.landmark("near neelima hosptil");   logger.info("landmark is added");
    mad.alternatephno("9441139192");        logger.info("AlternatePhone number is added");
    mad.addresstypeselect();                logger.info("type of address is selected home");
//  ac.SaveAndDeliver();                      logger.info("SaveAndDeliver clicked");
	Thread.sleep(6000);
	
	/*	Set<String> handels=driver.getWindowHandles();
	Iterator<String>it=handels.iterator();
	String Parentwindows=it.next();
	String childWindows=it.next();
	driver.switchTo().window(Parentwindows);
	driver.switchTo().window(childWindows);
	driver.switchTo().newWindow(WindowType.TAB);*/
	
	}

}

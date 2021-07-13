package flipkartMyProfile_PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyAddressDetails {
	WebDriver driver;
	public MyAddressDetails(WebDriver localdriver)//class name its self to write a constructor
	{
		this.driver=localdriver;
		PageFactory.initElements(localdriver, this);
	}
	By name=By.xpath("//input[@name='name']");//This is one method of finding element (By.Method)
	//Using FindBy for locating elements
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Manage Addresses')]")//This is anther method of finding element  (FindBy)
	@CacheLookup
	WebElement Manageaddress;
	@FindBy(how=How.XPATH,using="//div[@class='_1QhEVk']")
	@CacheLookup
	WebElement Addaddressclick;
	@FindBy(how=How.XPATH,using="//input[@name='phone']")
	@CacheLookup
	WebElement phone;
	@FindBy(how=How.XPATH,using="//input[@name='pincode']")
	@CacheLookup
	WebElement pincode;
	@FindBy(how=How.XPATH,using="//textarea[@name='addressLine1']")
	@CacheLookup
	WebElement Address ;
	@FindBy(how=How.XPATH,using="//input[@name='city']")
	@CacheLookup
	WebElement city ;
	@FindBy(how=How.XPATH,using="//select[@name='state']")
	@CacheLookup
	WebElement state;
	@FindBy(how=How.XPATH,using="//option[contains(text(),'Andhra Pradesh')]")
	@CacheLookup
	WebElement StateSelection;
	@FindBy(how=How.XPATH,using="//input[@name='landmark']")
	@CacheLookup
	WebElement Landmark;
	@FindBy(how=How.XPATH,using="//input[@name='alternatePhone']")
	@CacheLookup
	WebElement alternatephoneno;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Work')]")
	@CacheLookup
	WebElement AddressType;
	@FindBy(how=How.XPATH,using="//button[@class='_2KpZ6l _8NNVow']")
	@CacheLookup
	WebElement cancelButton;
	@FindBy(how=How.XPATH,using="//input[@name='addressLine2']")
	@CacheLookup
	WebElement locality;
	
	
	public WebElement EditName()
	{
		return driver.findElement(name);
	}	
	public void addressmanagelink()
	{
		Manageaddress.click();
	}
	public void addressbutton()
	{
		Addaddressclick.click();
	}
	public void pincodeEnter(String enterPincode)
	{
		pincode.sendKeys(enterPincode);
	}
	public void newphoneno(String phonenoadded)
	{
		phone.sendKeys(phonenoadded);
	}
	public void addressdetails(String addadress)
	{
		Address.sendKeys(addadress);
	}
	public void cityname(String entercity )
	{
		city.sendKeys(entercity);
	}
	public void statename()
	{
		state.click();
	}
	public void stateselection()
	{
		StateSelection.click();
	}
	public void landmark(String landmarkEnter)
	{
		Landmark.sendKeys(landmarkEnter);
	}
	public void alternatephno(String phnoadded )
	{
		alternatephoneno.sendKeys(phnoadded);
	}
	public void addresstypeselect()
	{
		AddressType.click();
	}
	public void cancelbutton()
	{
		cancelButton.click();
	}
	public void localityenter(String local )
	{
		locality.sendKeys(local);
	}
	
	 

}

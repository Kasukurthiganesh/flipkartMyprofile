package flipkartMyProfile_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public   LoginPage(WebDriver localdriver)
	{
		driver=localdriver;
		PageFactory.initElements(localdriver, this);
	}
	@FindBy(xpath="//*[@class='_2IX_2- VJZDxU']")
	WebElement EmailMobileNumber;
	@FindBy(xpath="//input[@type='password']")
	WebElement Password;
	@FindBy(how=How.XPATH,using="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")// "How"word page factory used in it
	@CacheLookup
	WebElement LoginButton;
	
	
	
	public void setemail(String username)
	{
		EmailMobileNumber.sendKeys(username);
	}
	public void setPassword(String password)
	{
		Password.sendKeys(password);
	}
	public void loginbutton()
	{
		LoginButton.click();
	}
}
	



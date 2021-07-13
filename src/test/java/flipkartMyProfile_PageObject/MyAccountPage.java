package flipkartMyProfile_PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

	WebDriver driver;
	
	public  MyAccountPage(WebDriver localdriver)
	{
		this.driver=localdriver;
		PageFactory.initElements(localdriver, this);
	}
	By account=By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div");//By method
	/*@FindBy(how=How.XPATH,using="//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div")
	@CacheLookup
	WebElement MyAccount;*/
	@FindBy(how=How.XPATH,using="//div[contains(text(),'My Profile')]")//FindBy method is used
	@CacheLookup
	WebElement MyProfile;
	@FindBy(how=How.XPATH,using="//span[@class='oKZoMV']")
	@CacheLookup
	WebElement personalinfoEdit;
	@FindBy(how=How.NAME,using="firstName")
	@CacheLookup
	WebElement firstname;
	@FindBy(how=How.NAME,using="lastName")
	@CacheLookup
	WebElement Lastname;
	@FindBy(how=How.XPATH,using="//button[@class='_2KpZ6l _3eVCfA']")
	@CacheLookup
	WebElement Saved;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Male')]")
	@CacheLookup
	WebElement Gender;
	@FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")
	@CacheLookup
	WebElement emailedit;
	@FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement Email;
	@FindBy(how=How.XPATH,using="//button[@class='_2KpZ6l _25vsmg _1-iOO7']")
	@CacheLookup
	WebElement Emailsave;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Logout')]")
	@CacheLookup
	WebElement Logoutbutton;
	public WebElement Myaccount() // By method is applied
	{
		return driver.findElement(account);	
	}
	public void FirstName(String enterFirstname)//Find By Method is used
	{
		firstname.sendKeys(enterFirstname);
	}
/*	public void MyAccount()
	{
		MyAccount.click();
	}*/
	public void myprofile()
	{
		MyProfile.click();
	}
	public void PersonalEdit()
	{
		personalinfoEdit.click();
	}
	public void FirstNameclear()
	{
		firstname.clear();
	}
	
	public void lastnameclear()
	{
		Lastname.clear();
	}
	public void lastnameEnter(String lastname)
	{
		Lastname.sendKeys(lastname);
	}
	public void Save()
	{
		Saved.click();
	}
	public void EnterGender()
	{
		Gender.click();
	}
	public void editemail()
	{
		emailedit.click();
	}
	public void Email(String Emailenter)
	{
		Email.sendKeys(Emailenter);
	}
	public void EmailSaved()
	{
		Emailsave.click();
	}
	public void logoutbutton()
	{
		Logoutbutton.click();
	}

}

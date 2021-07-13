package flipkartMyProfile_PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	WebDriver driver;
	public AddToCart(WebDriver localdriver)
	{
		this.driver=localdriver;
		PageFactory.initElements(localdriver, this);
	
	}
	@FindBy(how=How.XPATH,using="//input[@class='_3704LK']")
	@CacheLookup
	WebElement SearchForProduct;
	@FindBy(how=How.XPATH,using="//button[@class='L0Z3Pu']")
	@CacheLookup
	WebElement searchbuttonclick;
	@FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/*[1]")
	@CacheLookup
	WebElement minPriceButtonclick;
	@FindBy(how=How.XPATH,using="//div[@class='_1YAKP4']/select/option[5]")
	@CacheLookup
	WebElement minamountclicked;
	@FindBy(how=How.XPATH,using="//div[@class='_3uDYxP']")
	@CacheLookup
	WebElement maxmButtonclicked;
	@FindBy(how=How.XPATH,using="//div[@class='_3uDYxP']/select/option[6]")
	@CacheLookup
	WebElement maxmAmountclicked;
	@FindBy(how=How.XPATH,using="//div[@title='6 GB & Above']")
	@CacheLookup
	WebElement RAMclicked;
	@FindBy(how=How.XPATH,using="//section[@class='_167Mu3 _2hbLCH']/div[2]/div[1]/div[28]")
	@CacheLookup
	WebElement mobilephnoeclicked;
	@FindBy(how=How.XPATH,using="//div[@title='4★ & above']")
	@CacheLookup
	WebElement Ratingclicked;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Internal Storage')]")
	@CacheLookup
	WebElement internalStoragebutton ;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'128 - 255.9 GB')]")
	@CacheLookup
	WebElement internalStorageclicked;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Battery Capacity')]")
	@CacheLookup
	WebElement Batterybuttonclicked;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'4000 - 4999 mAh')]")
	@CacheLookup
	WebElement Batterycapicityclicked;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Operating System')]")
	@CacheLookup
	WebElement operationsystemclicked;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Android')]")
	@CacheLookup
	WebElement Androidclicked ;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'ViVO Y73 (Roman Black, 128 GB)')]")
	@CacheLookup
	WebElement VivoPhoneClicked;
	@FindBy(how=How.XPATH,using="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	@CacheLookup
	WebElement AddToCartbuttonclicked;
	@FindBy(how=How.XPATH,using="//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
	@CacheLookup
	WebElement placeanOrder;
	@FindBy(how=How.XPATH,using="//button[@class='_2KpZ6l _1JDhFS _3AWRsL']")
	@CacheLookup
	WebElement SaveAndDeliver;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'23 MORE')]")
	@CacheLookup
	WebElement phonemoresearched ;
	
	 /*Defining all the user actions that can be performed in the loginPage
    in the form of methods*/
	public void Searchforproduct(String Searchboxeneter)
	{
		SearchForProduct.sendKeys(Searchboxeneter);		
	}
	public void searchbuttonclick()
	{
		searchbuttonclick.click();
	}
	
	public void minPriceButtonclick()
	{
		minPriceButtonclick.click();
	}
	public void minamountclicked()
	{
		minamountclicked.click();
	}
	public void maxmButtonclicked()
	{
		maxmButtonclicked.click();
	}
	public void maxmAmountclicked()
	{
		maxmAmountclicked.click();
	}
	public void RAMclicked()
	{
		RAMclicked.click();
	}
	public void mobilephnoeclicked()
	{
		mobilephnoeclicked.click();
	}
	public void Ratingclicked()
	{
		Ratingclicked.click();
	}
	public void internalStoragebutton()
	{
		internalStoragebutton.click();
	}
	public void internalStorageclicked()
	{
		internalStorageclicked.click();
	}
	public void Batterybuttonclicked()
	{
		Batterybuttonclicked.click();
	}
	public void Batterycapicityclicked()
	{
		Batterycapicityclicked.click();
	}
	public void operationsystemclicked()
	{
		operationsystemclicked.click();
	}
	public void Androidclicked()
	{
		Androidclicked.click();
	}
	public void VivoPhoneClicked()
	{
		VivoPhoneClicked.click();
	}
	public void AddToCartbuttonclicked()
	{
		AddToCartbuttonclicked.click();
	}
	public void placeanOrder()
	{
		placeanOrder.click();
	}
	public void SaveAndDeliver()
	{
		SaveAndDeliver.click();
	}
	public void phonemoresearched()
	{
		phonemoresearched.click();
	}
	

	
	
	
	


}

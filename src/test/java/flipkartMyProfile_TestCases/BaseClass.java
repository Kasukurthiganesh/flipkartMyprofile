package flipkartMyProfile_TestCases;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import flipkartMyProfile_Utilites.Readconfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	Readconfig rc=new Readconfig();
	public String baseurl=rc.setupbaseurl();
	public String email =rc.SetupUsername();
	public String password=rc.SetupPassword();
	public static Logger logger;
	
	
	@BeforeTest
	  public void Setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 logger=Logger.getLogger("flipkart");
	     PropertyConfigurator.configure("Log4j.properties");
	     driver.get(baseurl);
	     logger.info("url is entered");
		
		
	}
	@AfterTest
	public void Teardrop()
	{
		logger.info("Page is closed");
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

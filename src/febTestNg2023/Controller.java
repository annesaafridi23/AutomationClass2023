package febTestNg2023;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Controller {
	WebDriver driver;
	
	String AppUrl;
	
	
	@BeforeSuite()
	public void config() {
	
    System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\libs\\chromedriver.exe");
    AppUrl = "https://automationexercise.com/" ;
    		 
	}
	
	@BeforeTest()
	public void setup() {
	driver = new ChromeDriver();
    		 
	
	}
  @BeforeClass()  		 
   public void Synchronize() {		 
   driver.manage() .timeouts().implicitlyWait(10,TimeUnit.SECONDS);		 
    	Ex = new WebDriverWait(driver,10) ;	 
    		 
  }
  @AfterMethod ()
  public void validation() {
	  System.out.println("Validations succesfully");// We Validate our code executions.
	  System.out.println("Method executed succesfuly");
  }
    
  @AfterTest()
  public void BrowserClosing() throws InterruptedException  {
    		 Thread.sleep(2000);// We use thread.sleep to make Java wait so we can see our execution resuts.
    		 driver.close ();// We cose the Browser
    		 
  }
  
  @AfterSuite
  public void terminate() {
	  driver.quit(); // We close the Instance and terminate the session. It will erase all the cache memory and make our next execution.
  }
    		 
	}


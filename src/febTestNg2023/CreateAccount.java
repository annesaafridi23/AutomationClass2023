package febTestNg2023;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

 

@Test
public class CreateAccount extends Controller {

	
	public void OpenBrowser() {//1st step
	 driver.get((AppUrl));  
	}
		
	public void ClickSignIn()	{//2nd step
    driver.findElement(By.xpath( "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
	}
    public void  EnterUserName () {//3rd step
    	Ex.until(ExpectedConditions.elementToBeClickable(UserName));
    driver.findElement(By.xpath("//input[@name='name']")).sendKeys(Tanvir); 
    }
    
    public void EnterEmail() {//4th step
    	driver.findElement(By.xpath("//input[starts-with(@data-qa,'signup')][position()=2]")).sendKeys("xys@yahoo.com");
    			
    }
    public void Submit() {//5th step
    driver.findElement(By.xpath("//button[contains@data-qa.'signup-button')]")).click();
    }
    
	}
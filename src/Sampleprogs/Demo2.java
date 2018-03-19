package Sampleprogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
	WebDriver driver;
	@BeforeTest
	void openbrowser() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mujeeba Mohamed Ali\\Documents\\chromedriver.exe");
	driver = new ChromeDriver(); 
	String expurl = "http://www.flipkart.com/" ;
	driver.navigate().to(expurl);
	
	}
//	  @AfterMethod
//	  public void closebrowser() {
//		  //driver.close();
//	  }
  @Test(priority = 1)
  void flipkartlogin() throws InterruptedException {

	  Thread.sleep(3000);
	  String gettext = driver.findElement(By.className("b5konl")).getText();
	  Assert.assertEquals(gettext, "Enter Email/Mobile number");
	  System.out.println(gettext);
		driver.findElement(By.xpath(ElementsRep.email)).sendKeys("mujimustaq@gmail.com");
		driver.findElement(By.xpath(ElementsRep.password)).sendKeys("Mujeeba_2016");
		driver.findElement(By.xpath(ElementsRep.submit)).click();
		Thread.sleep(3000);
		//driver.close();
		System.out.println("GIT hub testing");
	  System.out.println("GIT hub testing- update");
	  
	}
//@Test(priority = 2)
  
}

package Sampleprogs;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipkartTestng {
//	public static WebDriver driver;
//	public static WebElement element;
	
	@Test
	public static void openbrowser() throws InterruptedException
	{
	System.out.println("Test");
	
	}

  @BeforeMethod
	  public static void flipkartlogin() throws InterruptedException {
		System.out.println("BeforeTest");
		}

	
//  @Test(priority = 2)
//  public static WebDriver searchresult() throws InterruptedException {
//	  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div[1]/div/a/div[3]/div[1]/div[1]")).click();
//		
//	    
//	    String parentHandle = driver.getWindowHandle(); // get the current window handle
//	                                    //Clicking on this window
//	    for (String winHandle : driver.getWindowHandles()) { //Gets the new window handle
//	        driver.switchTo().window(winHandle); 
//	    }
//	    Thread.sleep(3000);
//	    return null;
//  }
//  @Test(priority = 3)
//  public static WebDriver addtocart() throws InterruptedException
//	{
//	  driver.manage().window().maximize();
//		//driver.findElement(By.cssSelector("button[class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div[1]/div/div[1]/div[2]/ul/li[1]/button")).click();
//		Thread.sleep(3000);
//		//driver.findElement(By.cssSelector("button[class='_2AkmmA _14O7kc _7UHT_c']")).click();
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div[1]/div[3]/div/div/form/button")).click();
//		return null;
//	}
//  @Test
//  public static WebDriver searchitem() throws InterruptedException
//	{
//	  Thread.sleep(3000);
//		element = driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[1]/form/div/div[1]/div/input"));
//		element.sendKeys("Samsung mobiles");
//		element.submit();
//		Thread.sleep(3000);
//		return null;
//	}
  

  @AfterTest
  public void closebrowser() {
	  //driver.close();
  }

}

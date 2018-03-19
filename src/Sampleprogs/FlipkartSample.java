package Sampleprogs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.sql.Driver;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipkartSample {
	
	public static WebDriver driver;
	public static WebElement element;
	public static WebDriver openbrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mujeeba Mohamed Ali\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		String expurl = "http://www.flipkart.com/" ;
		driver.navigate().to(expurl);
		Thread.sleep(3000);
		return driver;
	
	}
	public static WebDriver flipkartlogin() throws InterruptedException {
		//driver = openbrowser().driver;
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("mujimustaq@gmail.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("Mujeeba_2016");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
		Thread.sleep(3000);
		return null;
	}

	public static WebDriver searchitem() throws InterruptedException
	{
		element = driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[1]/form/div/div[1]/div/input"));
		element.sendKeys("Samsung mobiles");
		element.submit();
		Thread.sleep(3000);
		return null;
	}
	public static WebDriver searchresult() throws InterruptedException
	{
		//driver.findElement(By.linkText("https://rukminim1.flixcart.com/image/312/312/j1qqs280/mobile/m/7/d/samsung-galaxy-on-nxt-sm-g610fzdhins-original-imaet97hmqvfn5a6.jpeg?q=70")).click();
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div[1]/div/a/div[3]/div[1]/div[1]")).click();
		
	    
	    String parentHandle = driver.getWindowHandle(); // get the current window handle
	    System.out.println("Parent handle" +parentHandle);               //Prints the parent window handle 
	                                    //Clicking on this window
	    for (String winHandle : driver.getWindowHandles()) { //Gets the new window handle
	        //System.out.println(winHandle);
	        driver.switchTo().window(winHandle); 
	    }
	    Thread.sleep(3000);
		return null;
	}
	public static WebDriver addtocart() throws InterruptedException
	{
		String currentwindow = driver.getWindowHandle();
		System.out.println("Current window" +currentwindow);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("button[class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div[1]/div/div[1]/div[2]/ul/li[1]/button")).click();
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("button[class='_2AkmmA _14O7kc _7UHT_c']")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div[1]/div[3]/div/div/form/button")).click();
		return null;
	}

public static void main(String[] args) throws InterruptedException {
	openbrowser();
	flipkartlogin();
	searchitem();
	searchresult();
	addtocart();
		//driver.close();
	
}
}
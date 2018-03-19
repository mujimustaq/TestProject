import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAmz {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mujeeba Mohamed Ali\\Documents\\chromedriver.exe");
			driver = new ChromeDriver();
			String expurl = "http://www.automationpractice.com/" ;
			driver.navigate().to(expurl);
			//driver.findElement(By.partialLinkText("See all")).click();
			//driver.findElement()
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
			driver.findElement(By.name("email_create")).sendKeys("mujimustaq@gmail.com");
			driver.findElement(By.id("SubmitCreate")).click();		
			
}
}
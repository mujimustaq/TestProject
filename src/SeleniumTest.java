import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
	public static void main(String[] args) throws InterruptedException {


//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mujeeba Mohamed Ali\\eclipse-workspace\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
	//driver = new ChromeDriver();
	//driver = new FirefoxDriver();
	//get URL
	String expurl = "https://www.google.co.in/" ;
	driver.navigate().to(expurl);
	String url = driver.getCurrentUrl();
	if(expurl == url)
	{ 
		System.out.println("The URL matches");
	}
	else
	{
		System.out.println("The URL does not matches");
	}
	int lenght = url.length();
	System.out.println("The lenght of the URL is" +lenght);
	System.out.println(url);
	//driver
	//Google Navigate
	WebElement Element = driver.findElement(By.id("lst-ib"));
	Element.sendKeys("type something");
	Element.submit();
	//WebDriverWait wait = new WebDriverWait(driver, 10);
	driver.navigate().back();
	//driver.wait();
	//Element.wait;
	driver.navigate().forward();
	//driver.wait(5);
	driver.navigate().refresh();
	//driver.manage().timeouts().implicitlyWait(5, arg1);
	Thread.sleep(1000);
	//driver.wait(1000);
	driver.quit();
	//System.out.println("Success");
	}
}

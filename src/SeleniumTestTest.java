import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTestTest {

  @Test()
  public void main() {
    
    WebDriver driver;

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mujeeba Mohamed Ali\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
	String expurl = "https://www.google.co.in/" ;
	driver.navigate().to(expurl);
	String url = driver.getCurrentUrl();
	if(expurl.equals(url))
	{ 
		System.out.println("The URL matches");
		Reporter.log("URL matches" +url);
	}
	else
	{
		System.out.println("The URL does not matches");
		Reporter.log("URL does not match" +url);
	}
	int lenght = url.length();
	System.out.println("The lenght of the URL is" +lenght);
	System.out.println(url);
	
  }
  
}

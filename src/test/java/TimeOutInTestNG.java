import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TimeOutInTestNG {
	
	@Test(timeOut = 2000)
	public void TimeOutMethod() {
       WebDriverManager.firefoxdriver().setup();
       WebDriver driver=new FirefoxDriver();
       driver.manage().window().maximize();
       
       driver.get("https://demo.testfire.net/login.jsp");
       driver.close();
       
	} 
}

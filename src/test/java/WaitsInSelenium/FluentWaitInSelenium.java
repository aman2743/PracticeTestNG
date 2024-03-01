package WaitsInSelenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitInSelenium {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn2")).click();
//      Waiting 30 seconds for an element to be present on the page, checking
//      for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30))
		       .pollingEvery(Duration.ofSeconds(5))
		       .ignoring(NoSuchElementException.class);

		   WebElement we = wait.until(new Function<WebDriver, WebElement>()
//				   anonymous class
//				   Function is an interface and creating anonymous class and defining body of the method apply
		   {
		     public WebElement apply(WebDriver driver) 
		     {
		       return driver.findElement(By.id("txt2"));
		     }
		   });
		
		we.sendKeys("Test123");
//	    Assertions.assertEquals("Displayed", ((Object) revealed).getDomProperty("value"));
	}
}
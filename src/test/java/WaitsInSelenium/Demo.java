package WaitsInSelenium;

import java.time.Duration;
import java.util.function.Function;

//import org.apache.tools.ant.types.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo{
	@Test
	  public void explicitWithOptions() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
	    WebElement revealed = driver.findElement(By.id("revealed"));
	    driver.findElement(By.id("reveal")).click();

	    Wait<WebDriver> wait =
	        new FluentWait<>(driver)
	            .withTimeout(Duration.ofSeconds(2))
	            .pollingEvery(Duration.ofMillis(300))
	            .ignoring(ElementNotInteractableException.class);

	    wait.until(
	        d -> {
	          revealed.sendKeys("Displayed");
	          return true;
	        });
	    

//	    Assertions.assertEquals("Displayed", ((Object) revealed).getDomProperty("value"));
	  }
}

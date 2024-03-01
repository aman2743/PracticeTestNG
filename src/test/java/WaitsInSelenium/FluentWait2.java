package WaitsInSelenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
//				.withMessage("----time out is done...element is not found..." + locator);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txt1")));
		driver.findElement(By.id("txt1")).sendKeys("New Text");
		
	}
}

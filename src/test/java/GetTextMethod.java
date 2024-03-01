import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextMethod {
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			Thread.sleep(1000);
			WebElement we= driver.findElement(By.xpath("//td[text()='Canada']/parent::tr/child::td[1]"));
		    System.out.println(we.getText());
		    driver.quit();
	}
}

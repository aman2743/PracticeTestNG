package WaitsInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.xpath("//button[text()='Add Textbox1']")).click();
		driver.findElement(By.id("txt1")).sendKeys("Aman");
	}

}

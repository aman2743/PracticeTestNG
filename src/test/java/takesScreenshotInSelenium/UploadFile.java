package takesScreenshotInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		String str = System.getProperty("user.dir");
		System.out.println(str);
//		driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\Aman\\Desktop\\SeleniumFile\\Test1.jpeg");
		driver.findElement(By.id("uploadfile")).sendKeys(str + "\\uploadFile\\Test111.jpeg");

		Thread.sleep(1000);

	}
}

package takesScreenshotInSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreeshotTest {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.firefoxdriver().setup();//Driver Environment
		WebDriver driver=new FirefoxDriver();// creats an insatnce of firefox
		Thread.sleep(1000);
		driver.navigate().to("https://demo.testfire.net/login.jsp");
		Thread.sleep(1000);
		TakesScreenshot ts=(TakesScreenshot) driver;
//		File destFile=new File("./Screenshot/test.png");
//		File srcFile=ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(srcFile, destFile);
		FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File("./Screenshot/test1.png"));
		
		Thread.sleep(1000);
		driver.quit();
		
	}

}

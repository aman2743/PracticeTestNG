package captureScreenshotFramework;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static String screenshotsSubFolderName;

	@BeforeTest
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	public void captureScreenshot(String fileName) throws InterruptedException {
		if (screenshotsSubFolderName == null) {
			// Creating SunFolder
			LocalDateTime myDateObj = LocalDateTime.now();
			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
			screenshotsSubFolderName = myDateObj.format(myFormatObj);
		}
		TakesScreenshot ts = (TakesScreenshot) driver;
		File destFile = new File("./Screenshot/" +screenshotsSubFolderName+"/"+fileName);
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot saved Successfully");
	}

}

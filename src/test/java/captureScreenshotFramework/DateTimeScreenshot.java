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

import io.github.bonigarcia.wdm.WebDriverManager;

public class DateTimeScreenshot {
	static WebDriver driver;
    static String screenshotsSubFolderName;
	public static void main(String[] srgs)throws InterruptedException {
		    WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    Thread.sleep(1000);
		    driver.get("https://www.google.co.in");
			LocalDateTime myDateObj = LocalDateTime.now();
			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
			screenshotsSubFolderName = myDateObj.format(myFormatObj);
		TakesScreenshot ts = (TakesScreenshot) driver;
//		File destFile = new File("./Screenshot/" +screenshotsSubFolderName+"/"+"Test.png");
		File destFile = new File("./Screenshot/" +screenshotsSubFolderName+".png");
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot saved Successfully");
		driver.quit();
	}

}

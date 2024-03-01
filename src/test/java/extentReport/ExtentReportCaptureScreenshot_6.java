package extentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportCaptureScreenshot_6 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {

		ExtentReports extentReports=new ExtentReports();
		File file=new File("Report.html");
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
		extentReports.attachReporter(sparkReporter);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		Thread.sleep(3000);
		String path=captureScreenshot("google.jpg");
		String base64=captureScreenshot();
		extentReports
		.createTest("Screenshot Test 1","This is to attach screenshot at Test Level")
		.info("This is the info message")
		.addScreenCaptureFromPath(path);
		
		extentReports
		.createTest("Screenshot Test 2","This is to attach screenshot at Test Level")
		.info("This is the info message")
		.addScreenCaptureFromPath(path,"Google Homepage1")
		.addScreenCaptureFromPath(path,"Google Homepage2")
		.addScreenCaptureFromPath(path,"Google Homepage3")
		.addScreenCaptureFromPath(path,"Google Homepage4");
		
		extentReports.createTest("Screenshot Test 3","This is to attach screenshot at Test Level")
		.info("Base64 image")
		.addScreenCaptureFromBase64String(base64);
		
		extentReports.createTest("Screenshot Test 4","This is to attach screenshot at Test Level")
		.info("Base64 image")
		.addScreenCaptureFromBase64String(base64,"Google Homepage1")
		.addScreenCaptureFromBase64String(base64,"Google Homepage2")
		.addScreenCaptureFromBase64String(base64,"Google Homepage3")
		.addScreenCaptureFromBase64String(base64,"Google Homepage4");
		
		extentReports.createTest("Screenshot Test 5","This is to attach screenshot at Log Level")
		.info("This is the info message")
		.fail(MediaEntityBuilder.createScreenCaptureFromBase64String(base64).build())
		.fail(MediaEntityBuilder.createScreenCaptureFromBase64String(base64,"Google Home Page").build());
		
		extentReports.createTest("Screenshot Test 6","This is to attach screenshot at Log Level")
		.info("This is the info message")
		.fail(MediaEntityBuilder.createScreenCaptureFromPath(path).build())
		.fail(MediaEntityBuilder.createScreenCaptureFromPath(path,"Google Home Page").build());
		
		extentReports.createTest("Screenshot Test 7","This is to attach screenshot at Log Level")
		.info("This is the info message")
		.fail("This is the info message",MediaEntityBuilder.createScreenCaptureFromBase64String(base64).build())
		.fail("This is the info message",MediaEntityBuilder.createScreenCaptureFromBase64String(base64,"Google Home Page").build());
		
		extentReports.createTest("Screenshot Test 8","This is to attach screenshot at Log Level")
		.info("This is the info message")
		.fail("This is the info message",MediaEntityBuilder.createScreenCaptureFromPath(path).build())
		.fail("This is the info message",MediaEntityBuilder.createScreenCaptureFromPath(path,"Google Home Page").build());
		
		Throwable t=new Throwable("This is custom exception");
		
		extentReports.createTest("Screenshot Test 9","This is to attach screenshot at Log Level")
		.info("This is the info message")
		.fail(t,MediaEntityBuilder.createScreenCaptureFromBase64String(base64).build())
		.fail(t,MediaEntityBuilder.createScreenCaptureFromBase64String(base64,"Google Home Page").build());
		
		extentReports.createTest("Screenshot Test 10","This is to attach screenshot at Log Level")
		.info("This is the info message")
		.fail(t,MediaEntityBuilder.createScreenCaptureFromPath(path).build())
		.fail(t,MediaEntityBuilder.createScreenCaptureFromPath(path,"Google Home Page").build());
		
		extentReports.flush();
		driver.quit();
		
		Desktop.getDesktop().browse(new File("report.html").toURI());
	}
	
	public static String captureScreenshot(String file1) throws InterruptedException {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File destFile=new File("./Screenshot/"+file1);
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
	  return srcFile.getAbsolutePath();
	}
	
	public static String captureScreenshot() {
		TakesScreenshot ts = (TakesScreenshot) driver;
		String str = ts.getScreenshotAs(OutputType.BASE64);
		return str;
	}
}

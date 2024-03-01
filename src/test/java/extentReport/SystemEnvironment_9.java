package extentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SystemEnvironment_9 {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Capabilities capabilities=((RemoteWebDriver)driver).getCapabilities();
		ExtentReports extentResports=new ExtentReports();
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(new File("report.html"));
		extentResports.attachReporter(sparkReporter);
		
//		Config HTML report
		ExtentSparkReporterConfig config=sparkReporter.config();
		config.setTheme(Theme.DARK);
		config.setDocumentTitle("DocumentTitle");
		config.setReportName("Reporter Name");
		config.setJs("document.getElementsByClassName('logo')[0].style.display='none';");
		
//		System Info in the Report
		extentResports.setSystemInfo("OS",System.getProperty("os.version"));
		extentResports.setSystemInfo("Java Version", System.getProperty("java.version"));
		extentResports.setSystemInfo("User Directory", System.getProperty("user.dir"));
		extentResports.setSystemInfo("Browser Name",capabilities.getBrowserName());
		extentResports.setSystemInfo("Browser Version",capabilities.getVersion());

//		Create Test 
		extentResports
		.createTest("Test1")
		.assignAuthor("Aman Kumar")
		.assignCategory("Sanity")
		.assignDevice("Chrome156")
		.pass("This is pass Test");
		
		extentResports
		.createTest("Test2")
		.assignCategory("Smoke")
		.assignDevice("Chrome161")
		.assignDevice("Edge121")
		.assignAuthor("Aman Kumar")
		.fail("This is the failed Test");
		
		extentResports
		.createTest("Test3")
		.assignCategory("Smoke","Sanity")
		.assignDevice("Chrome161","Chrome156","Firefox101")
		.assignAuthor("Aman Kumar","John")
		.pass("This is the pass Test");
		
		extentResports
		.createTest("Test4")
		.assignCategory(new String[]{"Smoke","Sanity"})
		.assignDevice(new String[]{"Chrome161","Chrome156","Firefox101"})
		.assignAuthor(new String[]{"Aman Kumar","John","David"})
		.pass("This is the pass Test");
		
//		Flush the report
		extentResports.flush();
//		Quit the driver
		driver.quit();
//		Launch the report automatically
		Desktop.getDesktop().browse(new File("report.html").toURI());
		
	}

}

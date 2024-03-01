package extentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LogEventsSequence {
   public static void main(String[] args) throws IOException {
    ExtentReports extentReports=new ExtentReports();//First object of main engine
    File file=new File("report.html");	
	ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
	extentReports.attachReporter(sparkReporter);
	extentReports.createTest("Test1")
	.log(Status.INFO,"info1")
	.log(Status.INFO,"info2")
	.log(Status.PASS,"Pass1");
//	.log(Status.PASS,"Pass2")
//	.log(Status.SKIP,"Skip1")
//	.log(Status.WARNING,"Warning1")
//	.log(Status.WARNING,"Warning2");
//	.log(Status.FAIL,"Fail1")
//	.log(Status.FAIL,"Fail2");
	extentReports.flush();
//	To open Report file automatically
	Desktop.getDesktop().browse(new File("report.html").toURI());
}
}

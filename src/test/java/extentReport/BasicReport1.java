package extentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BasicReport1 {
   public static void main(String[] args) throws IOException {
   ExtentReports extentReports=new ExtentReports();//First create this object
/*
//	Taking absolute path to save report
//	ExtentSparkReporter sparkReporter=new ExtentSparkReporter("C:\\Users\\Aman\\eclipse-workspace2\\PracticeTestNG\\ExtentReport\\report.html"); 
     */
	
/*
//	Taking relative path and in below case report would be generate at Project Level Path
//	ExtentSparkReporter sparkReporter=new ExtentSparkReporter("report.html");
     */	
    File file=new File("report.html");	
	ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
	extentReports.attachReporter(sparkReporter);
	ExtentTest test1=extentReports.createTest("Test1");
	test1.pass("This Test is pass");
	
	ExtentTest test2=extentReports.createTest("Test2");
	test2.log(Status.FAIL,"This Test is Failed");
	
	extentReports.createTest("Test3").skip("This Test is skipped");
	
	extentReports.flush();
//	To open Report file automatically
	Desktop.getDesktop().browse(new File("report.html").toURI());
}
}

package extentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AttributesInExtentResports_7 {
	public static void main(String[] args) throws IOException {
		ExtentReports extentResports=new ExtentReports();
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(new File("report.html"));
		extentResports.attachReporter(sparkReporter);
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
		
		
		extentResports.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());
		
	}

}

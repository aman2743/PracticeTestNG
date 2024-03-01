package extentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;

public class ExtentReportConfiguration_8_10 {
	public static void main(String[] args) throws IOException {
		ExtentReports extentResports=new ExtentReports();
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(new File("report.html"));
		sparkReporter.viewConfigurer().viewOrder().as(new ViewName[] {
				ViewName.DASHBOARD,
				ViewName.TEST,
				ViewName.CATEGORY,
				ViewName.DEVICE,
				ViewName.AUTHOR
		});
		
		extentResports.attachReporter(sparkReporter);
		ExtentSparkReporterConfig config=sparkReporter.config();
		config.setTheme(Theme.DARK);
		config.setDocumentTitle("DocumentTitle");
		config.setReportName("Reporter Name");
		config.setJs("document.getElementsByClassName('logo')[0].style.display='none';");
		
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
		
		Throwable t=new RuntimeException("Custome Exception");
		extentResports.createTest("Exception Test")
		.info(t);
		
		extentResports.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());
		
	}

}

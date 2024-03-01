package extentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LogDifferentInformation {
   public static void main(String[] args) throws IOException {
    ExtentReports extentReports=new ExtentReports();//First object of main engine
    File file=new File("report.html");	
	ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
	extentReports.attachReporter(sparkReporter);
	extentReports.createTest("Text based information")
	.log(Status.INFO,"<b>info1</b>")
	.log(Status.INFO, "<i>info2</i>");
	
	String XMLData="<note>\r\n"
			+ "  <to>Tove</to>\r\n"
			+ "  <from>Jani</from>\r\n"
			+ "  <heading>Reminder</heading>\r\n"
			+ "  <body>Don't forget me this weekend!</body>\r\n"
			+ "</note>";
			
	extentReports.createTest("XML based test")
	.info(MarkupHelper.createCodeBlock(XMLData, CodeLanguage.XML));
	
	String jsonData="{\r\n"
			+ "\"employees\":[\r\n"
			+ "  {\"firstName\":\"John\", \"lastName\":\"Doe\"},\r\n"
			+ "  {\"firstName\":\"Anna\", \"lastName\":\"Smith\"},\r\n"
			+ "  {\"firstName\":\"Peter\", \"lastName\":\"Jones\"}\r\n"
			+ "]\r\n"
			+ "}";
	extentReports.createTest("json based test")
	.log(Status.INFO,MarkupHelper.createCodeBlock(jsonData,CodeLanguage.JSON));
	
	List<String> lstData=new ArrayList<>();
	lstData.add("QA");
	lstData.add("TEST");
	lstData.add("ANALYST");
	extentReports.createTest("List Data Test")
	.info(MarkupHelper.createOrderedList(lstData))
	.info(MarkupHelper.createUnorderedList(lstData));
	
	Map<Integer,String> mapData=new HashMap<Integer,String>();
	mapData.put(1, "One");
	mapData.put(2, "Two");
	mapData.put(3, "Three");
	extentReports.createTest("Map Data Test")
	.info(MarkupHelper.createOrderedList(mapData))
	.info(MarkupHelper.createUnorderedList(mapData));
	
	Set <Integer> setData=mapData.keySet();
	extentReports.createTest("Set data test")
	.info(MarkupHelper.createOrderedList(setData))
	.info(MarkupHelper.createUnorderedList(setData));
	
	extentReports.createTest("Highlight Text")
	.info(MarkupHelper.createLabel("Custom Text",ExtentColor.GREEN));
	
	try {
		int i=5/0;
	} catch (Exception e) {
		extentReports.createTest("Exception Test1")
		.info(e);
	}
	Throwable t=new RuntimeException("Custome Exception");
	extentReports.createTest("Exception Test2")
	.info(t);
	
	extentReports.flush();
//	To open Report file automatically
	Desktop.getDesktop().browse(new File("report.html").toURI());
}
}

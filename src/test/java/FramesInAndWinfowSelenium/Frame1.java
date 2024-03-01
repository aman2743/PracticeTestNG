package FramesInAndWinfowSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().to("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Default Page");
		WebElement we=driver.findElement(By.id("frm1"));
		driver.switchTo().frame(we);
		Thread.sleep(1000);
		WebElement we1=driver.findElement(By.xpath("//select[@id='course' ]"));
		Select sl=new Select(we1);
		List<WebElement> lst=sl.getOptions();
	    System.out.println(lst.size());
	    
	    for(WebElement we2:lst) {
//	    	String str=we2.getText();
//	    	System.out.println(str);
//	    	sl.selectByVisibleText(str);
//	    	Thread.sleep(1000);
	    	we2.click();
	    	System.out.println(we2.getText());
	    }
	    Thread.sleep(1000);
	   driver.switchTo().defaultContent();	
	   driver.findElement(By.xpath("//input[@id='name']")).clear();
	   driver.findElement(By.xpath("//input[@id='name']")).sendKeys("New Default Page");
	   

	 
		
	}
}

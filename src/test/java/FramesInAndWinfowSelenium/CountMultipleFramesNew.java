package FramesInAndWinfowSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountMultipleFramesNew {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(1000);
		int frames=driver.findElements(By.tagName("iframe")).size();
	    System.out.println("Number of frames:"+frames);
	    
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Satying at Main Page");
		System.out.println(driver.getTitle());
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm3']")));
		WebElement we1=driver.findElement(By.id("name"));
        we1.sendKeys("Inside frame 3");
        Thread.sleep(5000);

        driver.switchTo().frame(driver.findElement(By.id("frm1")));
        WebElement we=driver.findElement(By.id("selectnav1"));
        Select sl=new Select(we);
        sl.selectByIndex(1);
        Thread.sleep(5000);
        
        driver.switchTo().frame(driver.findElement(By.id("frm2")));
        Thread.sleep(3000);
        System.out.println(driver.getPageSource());
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Suman");
        
//       driver.switchTo().parentFrame();
//        System.out.println(we1.getText());
//        Thread.sleep(5000);
//        we1.sendKeys("Latest **********Inside frame 3");
//        Thread.sleep(3000);
//        driver.switchTo().defaultContent();
//    	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Latest Staying at Main Page");
        

	}
}

package FramesInAndWinfowSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesNew {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
//		frame count
		int frames=driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of frames:"+frames);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Satying at Main Page");
		System.out.println(driver.getTitle());
		
//		Switches focus to frame1 one from main page
		WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frm1']"));
		driver.switchTo().frame(frame1);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
//		Switching frame to main page
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Satying at Main Page after frame");
		driver.quit();
	}
}

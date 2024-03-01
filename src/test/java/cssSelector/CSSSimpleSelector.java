package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSSimpleSelector {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
	Thread.sleep(1000);
	String str=driver.findElement(By.cssSelector("button")).getAttribute("id");
	System.out.println(str);
	driver.findElement(By.cssSelector("#firstName")).sendKeys("Aman Kumar");
	driver.findElement(By.cssSelector(".gender")).sendKeys("mail");
	System.out.println(driver.findElements(By.cssSelector("*")).size());
	
	}
}

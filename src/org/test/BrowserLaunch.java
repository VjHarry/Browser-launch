package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException {
// Browser launch		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Santhosh Sanjay\\eclipse-workspace\\JavaProject\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
	//	/ggsygysg
// Login
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys("Harry");
	
	WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	pass.sendKeys("12345");
	
	
	
//	WebElement login = driver.findElement(By.name("login"));
//	login.click();

// Get Text
	WebElement txt22 = driver.findElement(By.tagName("h2"));
	System.out.println(txt22.getText());
	
	WebElement txt2 = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
	System.out.println(txt2.getText());
	
	WebElement txt3 = driver.findElement(By.xpath("//h2[contains(@class,'_8')]"));
	System.out.println(txt3.getText());

// Get Attribute
	String att = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).getAttribute("alt");
	System.out.println(att);
	
	Thread.sleep(3000);
	
	driver.quit();	
		
	}
}

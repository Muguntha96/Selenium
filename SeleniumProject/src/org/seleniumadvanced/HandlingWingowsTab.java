package org.seleniumadvanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWingowsTab {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.manage().window().maximize();
		String parentWindow = driver.getWindowHandle();
	WebElement newTab = driver.findElement(By.xpath("//*[@id=\"button1\"]"));
	newTab.click();
	Thread.sleep(3000);

	
	Set<String> childWindow = driver.getWindowHandles();
	for (String handler : childWindow) {
		driver.switchTo().window(handler);
	}
	int size = driver.getWindowHandles().size();
	
	System.out.println("No of windows : "+size);
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Python for Automation")).click();
	Set<String> allwindows = driver.getWindowHandles();
	for (String childs : allwindows) {
		driver.switchTo().window(childs);
		driver.close();
	}
	driver.switchTo().window(parentWindow);
	driver.close();
	}

}

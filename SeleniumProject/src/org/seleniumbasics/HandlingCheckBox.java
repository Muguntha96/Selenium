package org.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class HandlingCheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		WebElement drop = driver.findElement(By.xpath("//*[@id='tree-node']/div/button[1]"));
	drop.click();
	WebElement notes=driver.findElement(By.xpath("//span[text()='Notes']"));
	notes.click();
	System.out.println(notes.isEnabled());
	Thread.sleep(3000);
	WebElement angular = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/ol/li/ol/li[2]/ol/li[1]/ol/li[2]/span/label/span[3]"));
	Actions action=new Actions(driver);
	action.moveToElement(angular).click().perform();
	System.out.println(angular.isEnabled());
	WebElement react=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/ol/li/ol/li[2]/ol/li[1]/ol/li[1]/span/label"));
	Actions action1=new Actions(driver);
	
	action1.moveToElement(react).click().perform();
	System.out.println(react.isEnabled());
	driver.close();
	
	
	
	
	}

}

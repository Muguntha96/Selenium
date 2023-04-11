package org.seleniumadvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingSelectable {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\BCP\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/selectable");
	driver.findElement(By.xpath("//*[@id=\'demo-tab-grid\']")).click();
	List<WebElement> row1 = driver.findElements(By.xpath("//*[@id='row1']/li"));
	System.out.println(row1.size());
	List<WebElement> row2 = driver.findElements(By.xpath("//*[@id='row2']/li"));
	System.out.println(row2.size());
	Actions action=new Actions(driver);
	action.keyDown(Keys.CONTROL)
	.click(row1.get(0))
	.click(row1.get(1))
	.click(row1.get(2))
	.build().perform();
	Thread.sleep(6000);
	action.clickAndHold(row2.get(0))
	.clickAndHold(row2.get(1))
	.clickAndHold(row2.get(2))
	.build().perform();
	Thread.sleep(4000);
	driver.close();
	
	
	
}
}

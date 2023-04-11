package org.seleniumadvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class HandlingToolTip {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\BCP\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/tooltip.html");
	WebElement mouseOver = driver.findElement(By.id("download_now"));
	Actions action=new Actions(driver);
	action.moveToElement(mouseOver).build().perform();
	WebElement toolTipMessage = driver.findElement(By.xpath("//*[@id=\"demo_content\"]/div/div/div/table/tbody/tr[1]/td[2]"));
	System.out.println(toolTipMessage.getText());
	driver.close();

	
}
}

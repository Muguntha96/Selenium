package org.seleniumadvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoComplete {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://jqueryui.com/autocomplete/#default");


	WebElement tags = driver.findElement(By.id("developer"));
	tags.sendKeys("a");
	
	List<WebElement> tagList = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
	for (WebElement list : tagList) {
		if (list.getText().equals("Jörn Zaefferer")) {
			list.click();
			break;
		}
	}
	}
	
	
	
	
	
	
	}



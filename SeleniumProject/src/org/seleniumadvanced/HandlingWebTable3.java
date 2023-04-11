package org.seleniumadvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		WebElement customers = driver.findElement(By.xpath("//*[@id=\'customers\']"));
	
		List<WebElement> rows = customers.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		for (WebElement webElement : rows) {
			System.out.println(webElement.getText());
		}
		
	}

}

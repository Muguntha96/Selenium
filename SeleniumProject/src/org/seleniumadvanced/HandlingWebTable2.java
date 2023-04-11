package org.seleniumadvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		//*[@id='countries']/tbody/tr
	WebElement country = driver.findElement(By.xpath("//*[@id='countries']/tbody"));
				 	 		
	 List<WebElement> Rows = country.findElements(By.tagName("tr"));
	 	  System.out.println(Rows.size());
	
	for (WebElement webElement : Rows) {
	List<WebElement> cell = webElement.findElements(By.tagName("td"));
		for (WebElement webElement2 : cell) {
			if (webElement2.getText().equals("English")) {
				System.out.println(webElement.getText());
				System.out.println();
			}
			
		}
			
		}
	}
	
	}



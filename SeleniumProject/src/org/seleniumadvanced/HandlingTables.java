package org.seleniumadvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTables {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");

		WebElement table = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr"));
		List<WebElement> columns = table.findElements(By.tagName("td"));

		int columnsCount = columns.size();
		System.out.println("No of columns : "+columnsCount);
		WebElement countRows=driver.findElement(By.xpath("//table[@id='countries']/tbody"));
		List<WebElement> rowsCount = countRows.findElements(By.tagName("tr"));
		int rowSize = rowsCount.size();	
		System.out.println("No of rows :"+rowSize);
		/*List<WebElement> cell = driver.findElements(By.xpath("//*[@id=\'countries\']/tbody/tr/td"));
		WebElement onecell = driver.findElement(By.xpath("//*[@id=\'countries\']/tbody/tr[8]/td[2]"));
		for (WebElement cellValue : cell) {
			if (cellValue.getText().equals(onecell)) {
				System.out.println(((WebElement) rowsCount).getText());
				break;
			}
			
			
		}*/
		
		for (WebElement webElement : rowsCount) {
			List<WebElement> columns1=webElement.findElements(By.tagName("td"));
			
			
			if(columns1.get(1).getText().equals("Algeria"))
				{
				for (WebElement webElement2 : columns1) {
					System.out.println(webElement2.getText());
				}
				}
			
			
		}
		
		
		}
		
		}

	



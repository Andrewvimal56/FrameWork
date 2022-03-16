package org.practice.classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablePractice {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
    	WebElement tRows = driver.findElement(By.xpath("(//tr[@class='odd'])[1]"));
		List<WebElement> cells = tRows.findElements(By.tagName("td"));
		WebElement element = cells.get(0);
		String text = element.getText();
		System.out.println(text);

	}
	
	/// Completed
}

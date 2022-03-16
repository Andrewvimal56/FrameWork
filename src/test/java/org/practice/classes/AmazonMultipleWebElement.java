package org.practice.classes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonMultipleWebElement {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("IPhone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> list = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		Set<WebElement> set = new LinkedHashSet<WebElement>();
		set.addAll(list);
		System.out.println(list.size());
		System.out.println(set.size());
		driver.quit();
		


	}
}

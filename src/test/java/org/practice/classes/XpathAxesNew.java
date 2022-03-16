package org.practice.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxesNew {
	public static WebDriver driver;

	public static void inputValue(String name, int number) {
		driver.findElement(By.xpath("//a[text()='" + name
				+ "']//parent::strong//parent::td//following-sibling::td[@data-colname='Rating']//child::span[@data-value='"
				+ number + "']")).click();
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://demo.wpjobboard.net/wp-login.php?redirect_to=https%3A%2F%2Fdemo.wpjobboard.net%2Fwp-admin%2Fadmin.php%3Fpage%3Dwpjb-job&reauth=1");
		driver.findElement(By.id("wp-submit")).click();
		driver.findElement(By.xpath("//a[@href='admin.php?page=wpjb-application']")).click();
		inputValue("Sarah Nole", 2);
		driver.quit();
	}

}

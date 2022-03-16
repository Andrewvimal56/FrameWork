package org.practice.classes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(
				"https://demo.wpjobboard.net/wp-login.php?redirect_to=https%3A%2F%2Fdemo.wpjobboard.net%2Fwp-admin%2Fadmin.php%3Fpage%3Dwpjb-job&reauth=1");
		driver.manage().window().maximize();
		driver.findElement(By.id("wp-submit")).click();
		driver.findElement(By.xpath("//a[@href='admin.php?page=wpjb-application']")).click();
		WebElement element = driver.findElement(By.xpath(
				"//a[text()= 'Emily Wood']//ancestor::div[@id='wpwrap']//child::span[@data-id='104']//child::span[@data-value='5']"));
		element.click();
		driver.quit();

	}

}

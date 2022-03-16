package org.practice.classes;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenImages {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		int count = 0;
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		for (int i = 0; i < images.size(); i++) {
			WebElement element =images.get(i);
			String attribute = element.getAttribute("src");
		//	System.out.println(attribute);
			
			if (attribute!=null) {
				URL url = new URL(attribute);
				URLConnection openConnection = url.openConnection();
				HttpURLConnection http = (HttpURLConnection) openConnection;
				int responseCode = http.getResponseCode();
				if (responseCode!=200) {
					System.out.println("Broken images"+ attribute);
					count++;
				}
			}
		}
		System.out.println("Broken images Count"+count);
		driver.quit();
	}
	}
	


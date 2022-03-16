package org.practice.classes;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import framework.baseclass.Assignments.Baseclass;

public class ActionsMoveToElement extends Baseclass {
	public static void main(String[] args) {
		getDriverAndLoadurl("http://greenstech.in/selenium-course-content.html");
	 WebElement element = driver.findElement(By.xpath("//div[@class='browse-wrapper-greens']//child::div[@class='header-browse-greens']"));
	 WebElement element2 = driver.findElement(By.xpath("//span[@class='nav-indicator']//preceding-sibling::span[text()='Master Program (8)']"));
	 WebElement element3 = driver.findElement(By.xpath("//span[text()='Data Analytics Certification Training']//parent::a"));
	 Actions actions = new Actions(driver);
	 actions.moveToElement(element).moveToElement(element2).moveToElement(element3).build().perform();
	 element3.click();
	 Set<String> set = driver.getWindowHandles();
	 List<String> list = new LinkedList<String>();
	 list.addAll(set);
	 
//	 int count=0;
//	 for (String string : set) {
//		if (count==1) {
//			driver.switchTo().window(string);
//		}
//		count++;
//	}
	 driver.switchTo().window(list.get(1));
	 WebElement element4 = driver.findElement(By.xpath("//a[@href='#batches']//parent::div"));
	 element4.click();
	 driver.switchTo().window(list.get(0));
	 
	 
	}

}

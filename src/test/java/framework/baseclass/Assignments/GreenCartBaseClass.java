package framework.baseclass.Assignments;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GreenCartBaseClass extends Baseclass {

	static WebDriver driver;

	@BeforeClass
	public static void UrlLaunch() {
		getDriverAndLoadurl("http://greenscart.in");
	}

	@Before
	public void beforeLogin() throws IOException {
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);
		takeScreenShotAndCopy("C:\\Users\\andre\\OneDrive\\Pictures\\Saved Pictures\\Before.png");

	}

	@After
	public void afterLogin() throws IOException {
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);
		takeScreenShotAndCopy("C:\\Users\\andre\\OneDrive\\Pictures\\Saved Pictures\\After.png");

	}


	@Test
	public void test() {
		Baseclass.Login("loginEmailId", "vimal", "loginPassword", "Vimal07", "(//input[@type='submit'])[2]");

	}

	@AfterClass
	public static void afterclass() {
	    closeWindow();
	}
	
}

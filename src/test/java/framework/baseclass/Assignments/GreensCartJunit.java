package framework.baseclass.Assignments;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.security.auth.login.LoginContext;

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

public class GreensCartJunit {
	static WebDriver driver;

	@BeforeClass
	public static void UrlLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://greenscart.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Before
	public void beforeLogin() throws IOException {
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File source = screenShot.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\andre\\OneDrive\\Pictures\\Saved Pictures\\Before.png");
		FileUtils.copyFile(source, des);
	}

	@After
	public void afterLogin() throws IOException {
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File source = screenShot.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\andre\\OneDrive\\Pictures\\Saved Pictures\\After.png");
		FileUtils.copyFile(source, des);

	}

	@AfterClass
	public static void afterclass() {
		driver.quit();
	}

	@Test
	public void test() {
		
		WebElement txtName = driver.findElement(By.xpath("//input[@id='loginEmailId']"));
		txtName.sendKeys("vimal");
		WebElement txtPass = driver.findElement(By.xpath("//input[@id='loginPassword']"));
		txtPass.sendKeys("Vimal07");
		WebElement btnLogin = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		btnLogin.click();
	}
}

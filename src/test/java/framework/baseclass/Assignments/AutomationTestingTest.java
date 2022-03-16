package framework.baseclass.Assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTestingTest {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement dDN = driver.findElement(By.id("Skills"));
		Select select = new Select(dDN);
		List<WebElement> options = select.getOptions();
		
		File file = new File("C:\\Users\\andre\\eclipse-workspace\\Employee\\Sheet\\ New Work2.xlsx");
		Workbook book = new XSSFWorkbook(); 
		Sheet sheet = book.createSheet("New Work2");
		
		for (int i = 0; i < options.size(); i++) {
			WebElement element = options.get(i);
			String text = element.getText();
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(text);
			FileOutputStream out = new FileOutputStream(file);
	     	book.write(out);
			
			
		}
		
	
		
		
	
	
	
	
	
		
	}
	
	
	

}

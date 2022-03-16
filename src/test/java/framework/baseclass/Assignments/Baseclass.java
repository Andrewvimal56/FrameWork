package framework.baseclass.Assignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;

	// 1.Get Driver Launch
	@SuppressWarnings("deprecation")
	public static void getDriverAndLoadurl(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();

	}

	private void getUrl() {
		driver.getCurrentUrl();
	}

	public static void takeScreenShotAndCopy(String location) throws IOException {
		TakesScreenshot tS = (TakesScreenshot) driver;
		File file = tS.getScreenshotAs(OutputType.FILE);
		File fileD = new File(location);
		FileUtils.copyFile(file, fileD);

	}

	public static void closeWindow() {
		driver.quit();
	}

	// Adactin login
	public static void Login(String attribute, String name, String attribute2, String pass, String attribute3) {
		WebElement element = driver.findElement(By.id(attribute));
		element.sendKeys(name);
		WebElement element2 = driver.findElement(By.id(attribute2));
		element2.sendKeys(pass);
		WebElement button = driver.findElement(By.xpath(attribute3));
		button.click();

	}

	// Search Hotel Page Adaction
	public void adactionSearchHotelPage(String location, String textLocation, String hotel, String textHotel,
			String room, String textRoom, String nRooms, String textnRooms, String checkIn, String textCheckIn,
			String checkOut, String textCheckOut, String aRoom, String textaRoom, String cRoom, String textcRoom,
			String button) {
		WebElement element = driver.findElement(By.id(location));
		element.sendKeys(textLocation);
		WebElement element2 = driver.findElement(By.id(hotel));
		element2.sendKeys(textHotel);
		WebElement element3 = driver.findElement(By.id(room));
		element3.sendKeys(textRoom);
		WebElement element4 = driver.findElement(By.id(nRooms));
		element4.sendKeys(textnRooms);
		WebElement element5 = driver.findElement(By.id(checkIn));
		element5.sendKeys(textCheckIn);
		WebElement element6 = driver.findElement(By.id(checkOut));
		element6.sendKeys(textCheckOut);
		WebElement element7 = driver.findElement(By.id(aRoom));
		element7.sendKeys(textaRoom);
		WebElement element8 = driver.findElement(By.id(cRoom));
		element8.sendKeys(textcRoom);
		WebElement element9 = driver.findElement(By.id(button));
		element9.click();

	}

	// Adaction select Hotel
	public void adactinSelectHotel(String button, String button2) {
		WebElement element = driver.findElement(By.id(button));
		element.click();
		WebElement element2 = driver.findElement(By.id(button2));
		element2.click();
	}

	// Adaction book A hotel
	public void adactionBookaHotel(String firstName, String textFirstName, String lastName, String textLastName,
			String billAddress, String textAddress, String cardNo, String textCardNo, String cardType,
			String textcardType, String month, String textMonth, String year, String textYear, String cvv,
			String textCvv, String button) {

		WebElement element = driver.findElement(By.id(firstName));
		element.sendKeys(textFirstName);
		WebElement element2 = driver.findElement(By.id(lastName));
		element2.sendKeys(textLastName);
		WebElement element3 = driver.findElement(By.id(billAddress));
		element3.sendKeys(textAddress);
		WebElement element4 = driver.findElement(By.id(cardNo));
		element4.sendKeys(textCardNo);
		WebElement element5 = driver.findElement(By.id(cardType));
		element5.sendKeys(textcardType);
		WebElement element6 = driver.findElement(By.id(month));
		element6.sendKeys(textMonth);
		WebElement element7 = driver.findElement(By.id(year));
		element7.sendKeys(textYear);
		WebElement element8 = driver.findElement(By.id(cvv));
		element8.sendKeys(textCvv);
		WebElement element9 = driver.findElement(By.id(button));
		element9.click();

	} // Addaction Get order Id

	public String adactionGetOrderId(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		String value = element.getAttribute("value");
		return value;
	}

	// 64.to Read Sheet
	public String getData(String sheetName, int rowNum, int cellNum) throws IOException {
		String data = null;
		File file = new File("C:\\Users\\andre\\eclipse-workspace\\FrameWork\\Sheet\\Book 1 Maven.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		CellType type = cell.getCellType();
		switch (type) {
		case STRING:
			data = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dF = new SimpleDateFormat("dd/MM/yyyy");
				data = dF.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				BigDecimal bD = BigDecimal.valueOf(numericCellValue);
				data = bD.toString();
			}
		default:
			break;
		}
		return data;

	}

	// 62. To Write in sheet
	public void writeData(String sheetName, int rowNum, int cellNum, String text) throws IOException {
		File file = new File("C:\\Users\\andre\\eclipse-workspace\\FrameWork\\Sheet\\Book 1 Maven.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(text);
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);

	}

	// 2. Get Current URL
	public String getCurrentUrl() {

		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	// 3. To load URL
	public void loadUrl(String url) {
		driver.get(url);
	}

	// 4.To get Text from website
	public String getText( WebElement textSelect) {
		WebElement element = driver.findElement(By.xpath("text"));
		String string = element.getText();
		return string;
	}

	// 5. To get Title
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	// 6. Insert Value in TextBox
	public void insertValue(WebElement element, String data) {
		element.sendKeys(data);

	}

	// 7.To click button
	public void click(WebElement element) {
		element.click();

	}

	// 13. Find locator using ID
	public WebElement findElementById(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
	}

	// 14.Find locator using Name
	public WebElement findElementByName(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
	}

	// 15.Find locator Using ClassName
	public WebElement findElementByClassName(String attributeValue) {
		WebElement element = driver.findElement(By.className(attributeValue));
		return element;

	}
	

	public String getAttribute(String name ) {
		WebElement element = driver.findElement(By.id(name));
		String string = element.getAttribute("value");
		return string;
	}

}

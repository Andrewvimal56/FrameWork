package org.Adaction.testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinTestNg extends BaseClass {
	@BeforeClass
	private void beforeclass() {
		getDriverLoadUrl("https://adactinhotelapp.com/");
	}

	@BeforeMethod
	private void beforeMethod() throws IOException {
		long millis = System.currentTimeMillis();
		System.out.println(millis);
		TakesScreenshot sShot = (TakesScreenshot) driver;
		File source = sShot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\andre\\OneDrive\\Pictures\\Saved Pictures\\ .png");
		FileUtils.copyFile(source, dest);
	}

	@Test
	private void adactinTesting() throws Throwable {
		LoginPage loginpPage = new LoginPage();
		loginpPage.loginPage(getData("Booking Data", 1, 0), getData("Booking Data", 1, 1));
		SearchHotelPage searchHotel = new SearchHotelPage();
		searchHotel.searchHotel(getData("Booking Data", 1, 2), getData("Booking Data", 1, 3),
				getData("Booking Data", 1, 4), getData("Booking Data", 1, 5), getData("Booking Data", 1, 6),
				getData("Booking Data", 1, 7), getData("Booking Data", 1, 8), getData("Booking Data", 1, 9));
		SelectHotelPage selectHotel = new SelectHotelPage();
		selectHotel.selectHotelPage();
		BookHotelPage book = new BookHotelPage();
		book.BookHotel(getData("Booking Data", 1, 10), getData("Booking Data", 1, 11), getData("Booking Data", 1, 12),
				getData("Booking Data", 1, 13), getData("Booking Data", 1, 14), getData("Booking Data", 1, 15),
				getData("Booking Data", 1, 16), getData("Booking Data", 1, 17));
		BookingConfirmation confirmation = new BookingConfirmation();
		insertData("Booking Data", 1, 18, confirmation.confirmation());
		BookedItinerary cancel = new BookedItinerary();
		cancel.CancelBooking(getData("Booking Data", 1, 18));
	}

	@AfterMethod
	private void afterMethod() throws IOException {
		long millis = System.currentTimeMillis();
		System.out.println(millis);
		TakesScreenshot sShot = (TakesScreenshot) driver;
		File source = sShot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\andre\\OneDrive\\Pictures\\Saved Pictures\\ .png");
		FileUtils.copyFile(source, dest);
	}

	@AfterClass
	private void afterclass() {
		closeWindows();
	}
}

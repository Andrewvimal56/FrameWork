package org.testNG.expriments;

import java.io.IOException;

import org.Adaction.testing.BaseClass;
import org.Adaction.testing.BookHotelPage;
import org.Adaction.testing.BookedItinerary;
import org.Adaction.testing.BookingConfirmation;
import org.Adaction.testing.LoginPage;
import org.Adaction.testing.SearchHotelPage;
import org.Adaction.testing.SelectHotelPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1Parameters extends BaseClass {
	@Parameters({ "userName", "passWord" })
	@Test
	private void adactinTesting1(String name, String pass) throws Throwable {
		getDriverLoadUrl("https://adactinhotelapp.com/");
		LoginPage loginpPage = new LoginPage();
		loginpPage.loginPage(name, pass);
	}
//	@BeforeMethod
//	private void beforeMethod() throws IOException {
//		long millis = System.currentTimeMillis();
//		System.out.println(millis);
//		TakesScreenshot sShot = (TakesScreenshot) driver;
//		File source = sShot.getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\andre\\OneDrive\\Pictures\\Saved Pictures\\Start.png");
//		FileUtils.copyFile(source, dest);
//	}


	@Test
	private void adatctinTesting2() throws IOException {
		getDriverLoadUrl("https://adactinhotelapp.com/");
		LoginPage loginpPage = new LoginPage();
		loginpPage.loginPage(getData("Booking Data", 1, 0), getData("Booking Data", 1, 1));
		SearchHotelPage searchHotel = new SearchHotelPage();
		searchHotel.searchHotel(getData("Booking Data", 1, 2), getData("Booking Data", 1, 3),
				getData("Booking Data", 1, 4), getData("Booking Data", 1, 5), getData("Booking Data", 1, 6),
				getData("Booking Data", 1, 7), getData("Booking Data", 1, 8), getData("Booking Data", 1, 9));
	}

	@Test
	private void adactinTesting3() throws IOException {
		getDriverLoadUrl("https://adactinhotelapp.com/");
		LoginPage loginpPage = new LoginPage();
		loginpPage.loginPage(getData("Booking Data", 1, 0), getData("Booking Data", 1, 1));
		SearchHotelPage searchHotel = new SearchHotelPage();
		searchHotel.searchHotel(getData("Booking Data", 1, 2), getData("Booking Data", 1, 3),
				getData("Booking Data", 1, 4), getData("Booking Data", 1, 5), getData("Booking Data", 1, 6),
				getData("Booking Data", 1, 7), getData("Booking Data", 1, 8), getData("Booking Data", 1, 9));
		SelectHotelPage selectHotel = new SelectHotelPage();
		selectHotel.selectHotelPage();
	}

	@Test
	private void adactinTesting4() throws IOException {
		getDriverLoadUrl("https://adactinhotelapp.com/");
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
	}

	@Test
	private void adactinTesting5() throws IOException {
		getDriverLoadUrl("https://adactinhotelapp.com/");
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
	}

	@Test
	private void adactinTesting6() throws IOException {
		getDriverLoadUrl("https://adactinhotelapp.com/");
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
//	@AfterMethod
//	private void afterMethod() throws IOException {
//		long millis = System.currentTimeMillis();
//		System.out.println(millis);
//		TakesScreenshot sShot = (TakesScreenshot) driver;
//		File source = sShot.getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\andre\\OneDrive\\Pictures\\Saved Pictures\\End.png");
//		FileUtils.copyFile(source, dest);
//	}

}

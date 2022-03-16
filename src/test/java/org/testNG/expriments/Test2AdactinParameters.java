package org.testNG.expriments;

import org.Adaction.testing.BaseClass;
import org.Adaction.testing.BookHotelPage;
import org.Adaction.testing.BookedItinerary;
import org.Adaction.testing.BookingConfirmation;
import org.Adaction.testing.LoginPage;
import org.Adaction.testing.SearchHotelPage;
import org.Adaction.testing.SelectHotelPage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test2AdactinParameters extends BaseClass {

	@Parameters({ "userName", "passWord", "location", "hotels", "roomType", "roomNo", "datePickin", "datePickOut",
			"adultPerRoom", "childRoom", "firstName", "lastName", "address", "cardNo", "cardType", "cardMonth",
			"cardYear", "cardCvv" })
	@Test
	private void adactinTesting(String name, String pass, String location, String hotels, String roomType,
			String roomNo, String datePickin, String datePickOut, String adultPerRoom, String childRoom,
			String firstName, String lastName, String address, String cardNo, String cardType, String cardMonth,
			String cardYear, String cardCvv) {
		getDriverLoadUrl("https://adactinhotelapp.com/");
		String url = getCurrentUrl();
		boolean contains = url.contains("adactinhotelapp");
		Assert.assertTrue(contains);
		LoginPage login = new LoginPage();
		login.loginPage(name, pass);
		
		Assert.assertEquals("Verify Id", "Andrew07", name);
		Assert.assertEquals("Verify passWord", "Andrew_07", pass);
		SearchHotelPage searchPage = new SearchHotelPage();
		searchPage.searchHotel(location, hotels, roomType, roomNo, datePickin, datePickOut, adultPerRoom, childRoom);
		SoftAssert sAssert = new SoftAssert();
		sAssert.assertEquals(childRoom, "1-one", "Verify ChildRoom");
		SelectHotelPage selectPage = new SelectHotelPage();
		selectPage.selectHotelPage();
		BookHotelPage book = new BookHotelPage();
		book.BookHotel(firstName, lastName, address, cardNo, cardType, cardMonth, cardYear, cardCvv);
		Assert.assertEquals("Verify CardCvv", "2341", cardCvv);
		sAssert.assertEquals(lastName, "Arul", "Verify Last Name");
		BookingConfirmation confirmation = new BookingConfirmation();
		String orderNo = confirmation.confirmation();
		System.out.println(orderNo);
		BookedItinerary cancel = new BookedItinerary();
		cancel.CancelBooking(orderNo);
		sAssert.assertAll();

	}
}
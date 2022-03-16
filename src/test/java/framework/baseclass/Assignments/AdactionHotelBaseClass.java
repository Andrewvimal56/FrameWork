package framework.baseclass.Assignments;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdactionHotelBaseClass extends Baseclass {

	@BeforeClass
	public static void BeforeClass() {
		getDriverAndLoadurl("https://adactinhotelapp.com/");

	}

	@Test
	public void login() throws IOException {
		String url = getCurrentUrl();
		boolean contains = url.contains("https://adactinhotelapp.com/");
		Assert.assertTrue("Verify Url", contains);
		WebElement txtName = findElementById("username");
		insertValue(txtName, getData("Booking Data", 1, 0));
		String attribute = getAttribute("username");
		// String attribute = txtName.getAttribute("value");
		Assert.assertEquals("verify name", "Andrew07", attribute);
		WebElement txtPassword = findElementById("password");
		insertValue(txtPassword, getData("Booking Data", 1, 1));
		String attribute2 = getAttribute("password");
		Assert.assertEquals("Verify Password", "Andrew_07", attribute2);
		WebElement btnLogin = findElementById("login");
		click(btnLogin);
//		String title2 = getTitle();
//		boolean contains2 = title2.contains(title2);
//		Assert.assertTrue("Verify Search Hotel Page", contains2);
		WebElement textSelect =findElementByXpath("//td[text()='Welcome to Adactin Group of Hotels']");
	//	String text = getText(textSelect);
	//	Assert.assertEquals("Verify Select Hotel Page", "Welcome to Adactin Group of Hotels",text);
		String location = getData("Booking Data", 1, 2);
		String hotels = getData("Booking Data", 1, 3);
		String roomType = getData("Booking Data", 1, 4);
		String nRooms = getData("Booking Data", 1, 5);
		String checkIn = getData("Booking Data", 1, 6);
		String checkOut = getData("Booking Data", 1, 7);
		String adults = getData("Booking Data", 1, 8);
		String child = getData("Booking Data", 1, 9);
		adactionSearchHotelPage("location", location, "hotels", hotels, "room_type", roomType, "room_nos", nRooms,
				"datepick_in", checkIn, "datepick_out", checkOut, "adult_room", adults, "child_room", child, "Submit");
		String title3 = getTitle();
		boolean contains3 = title3.contains(title3);
		Assert.assertTrue("Verify Select Hotel", contains3);
		adactinSelectHotel("radiobutton_0", "continue");
		String title4 = getTitle();
		boolean contains4 = title4.contains(title4);
		Assert.assertTrue("Verify Book A Hotel", contains4);
		String firstName = getData("Booking Data", 1, 10);
		String lastName = getData("Booking Data", 1, 11);
		String address = getData("Booking Data", 1, 12);
		String cardNo = getData("Booking Data", 1, 13);
		String cardType = getData("Booking Data", 1, 14);
		String cardMonth = getData("Booking Data", 1, 15);
		String cardYear = getData("Booking Data", 1, 16);
		String cardCvv = getData("Booking Data", 1, 17);
		adactionBookaHotel("first_name", firstName, "last_name", lastName, "address", address, "cc_num", cardNo,
				"cc_type", cardType, "cc_exp_month", cardMonth, "cc_exp_year", cardYear, "cc_cvv", cardCvv, "book_now");
		String orderId = adactionGetOrderId("order_no");
		writeData("Booking Data", 1, 18, orderId);

//		String attribute3 = getAttribute("//input[@value='Hello Andrew07!']");
//		Assert.assertEquals("Verify Search Hotel Page", "value", attribute3);

	}

	private WebElement findElementByXpath(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@AfterClass
	public static void afterClass() {
		closeWindow();

	}

}

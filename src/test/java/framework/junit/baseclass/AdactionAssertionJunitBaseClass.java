package framework.junit.baseclass;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
// For reusable Method accesing without creaing object you have to extend the base class
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class AdactionAssertionJunitBaseClass extends BaseClass {
	@BeforeClass
	public static void beforeTest() {
		// in static method u can only give static variables or methods so you have to
		// change the reusable method in base class into static
		getDriverLoadUrl("https://adactinhotelapp.com/");

	}

	@Test
	public void AdactionOrderNoTesting() throws IOException {
		String title = getTitle();
		boolean contains = title.contains(title);
		Assert.assertTrue("Verify Page Title", contains);
		System.out.println(title);
		// FindElement By Id reusable Method
		WebElement txtName = findElementById("username");
		// To get Data From Sheet Get Data Reusable Method
		String data = getData("Booking Data", 1, 0);
		// To send Keys Send Keys Reusable Method
		insertValue(txtName, data);
		String attributeValue = getAttributeValue(txtName);
		Assert.assertEquals("Verify Insert Value", data, attributeValue);
		System.out.println(attributeValue);

		// Password Webelemnt.Getdata.SendKeys Reusable Method
		WebElement txtPass = findElementByName("password");
		String data2 = getData("Booking Data", 1, 1);
		insertValue(txtPass, data2);
		String attributeValue1 = getAttributeValue(txtPass);
		Assert.assertEquals("Verify Insert Value", data2, attributeValue1);
		System.out.println(attributeValue1);
		// WebElement.CLick Reusable Methods
		WebElement btnLogin = findElementById("login");
		click(btnLogin);

		// Using FIndElement methods and getData and send Keys inserting values from xl
		// sheet
		WebElement textSelect = findElementByXpath("//td[text()='Welcome to Adactin Group of Hotels']");
		String text = getText(textSelect);
		Assert.assertEquals("Verify Select Hotel Page", "Welcome to Adactin Group of Hotels",text);
		
		WebElement txtLocation = findElementByName("location");
		String data3 = getData("Booking Data", 1, 2);
		insertValue(txtLocation, data3);

		WebElement txtHotels = findElementById("hotels");
		String data4 = getData("Booking Data", 1, 3);
		insertValue(txtHotels, data4);

		WebElement txtRoomType = findElementById("room_type");
		String data5 = getData("Booking Data", 1, 4);
		insertValue(txtRoomType, data5);

		WebElement txtRoomNos = findElementById("room_nos");
		String data6 = getData("Booking Data", 1, 5);
		insertValue(txtRoomNos, data6);

		WebElement txtDateIn = findElementById("datepick_in");
		clear(txtDateIn);
		String data7 = getData("Booking Data", 1, 6);
		insertValue(txtDateIn, data7);

		WebElement txtDateOut = findElementById("datepick_out");
		clear(txtDateOut);
		String data8 = getData("Booking Data", 1, 7);
		insertValue(txtDateOut, data8);

		WebElement txtAdultRoom = findElementById("adult_room");
		String data9 = getData("Booking Data", 1, 8);
		insertValue(txtAdultRoom, data9);

		WebElement txtChildRoom = findElementById("child_room");
		String data10 = getData("Booking Data", 1, 9);
		insertValue(txtChildRoom, data10);

		// CLick Reusable Method
		WebElement btnContinue = findElementById("Submit");
		click(btnContinue);

		// Select Hotel Page
		WebElement txtSelectHotel = findElementByXpath("//td[@class='login_title']");
		String text2 = getText(txtSelectHotel);
		Assert.assertEquals("Verify Select Page", "Select Hotel", text2);
		WebElement btnRadio = findElementById("radiobutton_0");
		click(btnRadio);
		WebElement btnCon = findElementById("continue");
		click(btnCon);

		// Book A Hotel Page
		WebElement txtBook = findElementByXpath("(//td[@class='login_title'])[2]");
		String text3 = getText(txtBook);
		Assert.assertEquals("Verify Book Page", "Book A Hotel", text3);
		WebElement txtFirstName = findElementById("first_name");
		String data11 = getData("Booking Data", 1, 10);
		insertValue(txtFirstName, data11);

		WebElement txtLastName = findElementById("last_name");
		String data12 = getData("Booking Data", 1, 11);
		insertValue(txtLastName, data12);

		WebElement txtAddress = findElementById("address");
		String data13 = getData("Booking Data", 1, 12);
		insertValue(txtAddress, data13);

		WebElement txtCcnum = findElementById("cc_num");
		String data14 = getData("Booking Data", 1, 13);
		insertValue(txtCcnum, data14);

		WebElement txtCctype = findElementById("cc_type");
		String data15 = getData("Booking Data", 1, 14);
		insertValue(txtCctype, data15);

		WebElement txtExpMonth = findElementById("cc_exp_month");
		String data16 = getData("Booking Data", 1, 15);
		insertValue(txtExpMonth, data16);

		WebElement txtExpYear = findElementById("cc_exp_year");
		String data17 = getData("Booking Data", 1, 16);
		insertValue(txtExpYear, data17);

		WebElement txtCvv = findElementById("cc_cvv");
		String data18 = getData("BookinG Data", 1, 17);
		insertValue(txtCvv, data18);

		WebElement btnBookNow = findElementById("book_now");
		click(btnBookNow);

		// Get Order id Using Get Attribute Reusabale Method
		WebElement txtBox = findElementById("order_no");
		String value = getAttributeValue(txtBox);
		insertData("Booking Data", 1, 18, value);

	}

	@AfterClass
	public static void afterTest() {
		closeWindows();
	}

}
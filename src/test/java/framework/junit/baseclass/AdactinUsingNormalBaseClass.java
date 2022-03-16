package framework.junit.baseclass;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AdactinUsingNormalBaseClass {
	public static void main(String[] args) throws IOException {
		// Creating Object For Base Class
		BaseClass base = new BaseClass();
		// Driver Launch Reusable Method
		base.getDriver();
		//Implicity Wait
		base.implicityWait();
		// Window Maximize reusable Method
		base.toMaximize();
		// get URL reusable Method
		base.loadUrl("https://adactinhotelapp.com/");
		// Get Title reusable Method
		String title = base.getTitle();
		System.out.println(title);
		// FindElement By Id reusable Method
		WebElement txtName = base.findElementById("username");
		// To get Data From Sheet Get Data Reusable Method
		String data = base.getData("Booking Data", 1, 0);
		// To send Keys Send Keys Reusable Method
		base.insertValue(txtName, data);

		// Password Webelemnt.Getdata.SendKeys Reusable Method
		WebElement txtPass = base.findElementByName("password");
		String data2 = base.getData("Booking Data", 1, 1);
		base.insertValue(txtPass, data2);

		// WebElement.CLick Reusable Methods
		WebElement btnLogin = base.findElementById("login");
		base.click(btnLogin);

		// Using FIndElement methods and getData and send Keys inserting values from xl
		// sheet
		WebElement txtLocation = base.findElementByName("location");
		String data3 = base.getData("Booking Data", 1, 2);
		base.insertValue(txtLocation, data3);

		WebElement txtHotels = base.findElementById("hotels");
		String data4 = base.getData("Booking Data", 1, 3);
		base.insertValue(txtHotels, data4);

		WebElement txtRoomType = base.findElementById("room_type");
		String data5 = base.getData("Booking Data", 1, 4);
		base.insertValue(txtRoomType, data5);

		WebElement txtRoomNos = base.findElementById("room_nos");
		String data6 = base.getData("Booking Data", 1, 5);
		base.insertValue(txtRoomNos, data6);
        
		WebElement txtDateIn = base.findElementById("datepick_in");
		base.clearTextbox(txtDateIn);
		String data7 = base.getData("Booking Data", 1, 6);
		base.insertValue(txtDateIn, data7);

		WebElement txtDateOut = base.findElementById("datepick_out");
		base.clearTextbox(txtDateOut);
		String data8 = base.getData("Booking Data", 1, 7);
		base.insertValue(txtDateOut, data8);

		WebElement txtAdultRoom = base.findElementById("adult_room");
		String data9 = base.getData("Booking Data", 1, 8);
		base.insertValue(txtAdultRoom, data9);

		WebElement txtChildRoom = base.findElementById("child_room");
		String data10 = base.getData("Booking Data", 1, 9);
		base.insertValue(txtChildRoom, data10);

		// CLick Reusable Method
		WebElement btnContinue = base.findElementById("Submit");
		base.click(btnContinue);

		// Select Hotel Page
		WebElement btnRadio = base.findElementById("radiobutton_0");
		base.click(btnRadio);
		WebElement btnCon = base.findElementById("continue");
		base.click(btnCon);

		// Book A Hotel Page
		WebElement txtFirstName = base.findElementById("first_name");
		String data11 = base.getData("Booking Data", 1, 10);
		base.insertValue(txtFirstName, data11);

		WebElement txtLastName = base.findElementById("last_name");
		String data12 = base.getData("Booking Data", 1, 11);
		base.insertValue(txtLastName, data12);

		WebElement txtAddress = base.findElementById("address");
		String data13 = base.getData("Booking Data", 1, 12);
		base.insertValue(txtAddress, data13);

		WebElement txtCcnum = base.findElementById("cc_num");
		String data14 = base.getData("Booking Data", 1, 13);
		base.insertValue(txtCcnum, data14);

		WebElement txtCctype = base.findElementById("cc_type");
		String data15 = base.getData("Booking Data", 1, 14);
		base.insertValue(txtCctype, data15);

		WebElement txtExpMonth = base.findElementById("cc_exp_month");
		String data16 = base.getData("Booking Data", 1, 15);
		base.insertValue(txtExpMonth, data16);

		WebElement txtExpYear = base.findElementById("cc_exp_year");
		String data17 = base.getData("Booking Data", 1, 16);
		base.insertValue(txtExpYear, data17);

		WebElement txtCvv = base.findElementById("cc_cvv");
		String data18 = base.getData("BookinG Data", 1, 17);
		base.insertValue(txtCvv, data18);

		WebElement btnBookNow = base.findElementById("book_now");
		base.click(btnBookNow);

		// Get Order id Using Get Attribute Reusabale Method
		WebElement txtBox = base.findElementById("order_no");
		String value = base.getAttributeValue(txtBox);
		base.insertData("Booking Data", 1, 18, value);

	}
}

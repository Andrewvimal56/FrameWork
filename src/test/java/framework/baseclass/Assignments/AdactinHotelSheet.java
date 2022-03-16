package framework.baseclass.Assignments;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AdactinHotelSheet {
	public static void main(String[] args) throws IOException {
		LibGlobal lib = new LibGlobal();
		lib.getDriverLoadUrl("https://adactinhotelapp.com/");
		String userName = lib.toReadSheet("Booking Data", 1, 0);
		String passWord = lib.toReadSheet("Booking Data", 1, 1);
		lib.adactinLogin("username", userName, "password", passWord, "login");
		String location = lib.toReadSheet("Booking Data", 1, 2);
		String hotels = lib.toReadSheet("Booking Data", 1, 3);
		String roomType = lib.toReadSheet("Booking Data", 1, 4);
		String nRooms = lib.toReadSheet("Booking Data", 1, 5);
		String checkIn = lib.toReadSheet("Booking Data", 1, 6);
		String checkOut = lib.toReadSheet("Booking Data", 1, 7);
		String adults = lib.toReadSheet("Booking Data", 1, 8);
		String child = lib.toReadSheet("Booking Data", 1, 9);
		lib.adactionSearchHotelPage("location", location, "hotels", hotels, "room_type", roomType, "room_nos", nRooms,
				"datepick_in", checkIn, "datepick_out", checkOut, "adult_room", adults, "child_room", child, "Submit");
		lib.adactinSelectHotel("radiobutton_0", "continue");
		String firstName = lib.toReadSheet("Booking Data", 1, 10);
		String lastName = lib.toReadSheet("Booking Data", 1, 11);
		String address = lib.toReadSheet("Booking Data", 1, 12);
		String cardNo = lib.toReadSheet("Booking Data", 1, 13);
		String cardType = lib.toReadSheet("Booking Data", 1, 14);
		String cardMonth = lib.toReadSheet("Booking Data", 1, 15);
		String cardYear = lib.toReadSheet("Booking Data", 1, 16);
		String cardCvv = lib.toReadSheet("Booking Data", 1, 17);
		lib.adactionBookaHotel("first_name", firstName, "last_name", lastName, "address", address, "cc_num", cardNo,
				"cc_type", cardType, "cc_exp_month", cardMonth, "cc_exp_year", cardYear, "cc_cvv", cardCvv, "book_now");
		String orderId = lib.adactionGetOrderId("order_no");
		lib.writeSheet("Booking Data", 1, 18, orderId);

	}

}

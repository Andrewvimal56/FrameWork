package org.Adaction.testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItinerary extends BaseClass {
	public BookedItinerary() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_id_text")
	private WebElement txtSearch;
	@FindBy(id = "search_hotel_id")
	private WebElement btnGo;
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement btnRadio;
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement btnCancel;

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getBtnGo() {
		return btnGo;
	}

	public WebElement getBtnRadio() {
		return btnRadio;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public void CancelBooking(String idNumber) {
		insertValue(getTxtSearch(), idNumber);
		click(getBtnGo());
		click(getBtnRadio());
		click(getBtnCancel());
		simpleAlert();

	}

}

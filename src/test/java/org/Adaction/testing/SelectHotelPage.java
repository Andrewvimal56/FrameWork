package org.Adaction.testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement btnRadio;
	@FindBy(id = "continue")
	private WebElement btnContinue;

	public WebElement getBtnRadio() {
		return btnRadio;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public void selectHotelPage() {
		click(getBtnRadio());
		click(getBtnContinue());
	}
}

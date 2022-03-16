package org.Adaction.testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtName;
	@FindBy(id = "password")
	private WebElement txtPassword;
	@FindBy(id = "login")
	private WebElement btnLogin;

	public WebElement getTxtName() {
		return txtName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void loginPage(String name, String password) {
		insertValue(getTxtName(), name);
		insertValue(getTxtPassword(), password);
		click(getBtnLogin());
	}
}

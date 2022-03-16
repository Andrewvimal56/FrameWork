package org.testNG.expriments;

import org.Adaction.testing.BaseClass;
import org.Adaction.testing.LoginPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test7CrossBrowserTest extends BaseClass {

	@Parameters("browser")
	@Test
	private void Test70(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			getDriverChrome();
            loadUrl("https://adactinhotelapp.com/");
			LoginPage login = new LoginPage();
			login.loginPage("Andrew07", "Andrew_07");
		} else if (browser.equalsIgnoreCase("firefox")) {
			getDriverFirefox();
			loadUrl("https://adactinhotelapp.com/");
			LoginPage login = new LoginPage();
			login.loginPage("Andrew07", "Andrew_07");

		} else if (browser.equals("IE")) {
			getDriverIE();
			loadUrl("https://adactinhotelapp.com/");
			LoginPage login = new LoginPage();
			login.loginPage("Andrew07", "Andrew_07");
		} else if (browser.equalsIgnoreCase("edge")) {
			getDriverEdge();
			loadUrl("https://adactinhotelapp.com/");
			LoginPage login = new LoginPage();
			login.loginPage("Andrew07", "Andrew_07");
		}
	}
}

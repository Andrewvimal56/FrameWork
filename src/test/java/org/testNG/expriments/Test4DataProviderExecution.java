package org.testNG.expriments;

import org.Adaction.testing.BaseClass;
import org.Adaction.testing.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test4DataProviderExecution extends BaseClass {

	@Test(dataProvider = "res")
	private void dataProvider(String s1, String s2) {
		getDriverChrome();
		loadUrl("https://adactinhotelapp.com/");
		LoginPage login = new LoginPage();
		login.loginPage(s1, s2);

	}

	@DataProvider(name = "res", parallel = true)
	public Object[][] testData() {
		Object[][] obj = new Object[][] { { "Andrew07", "Andrew_07" }, { "ArulVimal09", "Arul07" } };

		return obj;
	}
}

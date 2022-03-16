package org.testNG.expriments;

import org.Adaction.testing.BaseClass;
import org.Adaction.testing.LoginPage;
import org.testng.annotations.Test;



public class Test3DataProviderClass extends BaseClass {
	
	@Test (dataProvider = "res",dataProviderClass = Test4DataProviderExecution.class)
	private void test3(String s1,String s2) {
		getDriverChrome();
		loadUrl("https://adactinhotelapp.com/");
		LoginPage login = new LoginPage();
		login.loginPage(s1, s2);
	}
	
	
//	@Parameters({"userName","passWord"})
//	@Test()
//	private void adactinTesting3(@Optional("Andrew07") String name , String password)  {
//		getDriverLoadUrl("https://adactinhotelapp.com/");
//		LoginPage loginpPage = new LoginPage();
//		loginpPage.loginPage(name, password);
//
//	}
	@Test(dataProvider = "res",dataProviderClass = Test4DataProviderExecution.class)
	private void test2(String s1,String s2) {
		getDriverChrome();
		loadUrl("https://adactinhotelapp.com/");
		LoginPage login = new LoginPage();
		login.loginPage(s1, s2);
	}
}
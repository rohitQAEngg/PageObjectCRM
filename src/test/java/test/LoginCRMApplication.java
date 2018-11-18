package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CRMobjectMethods.LoginAction;
/*
 * 
 * Login to cRM application with valid credential* 
 * 
 * 
 * 
 * Author-Rohit L.* */
import browser.BrowserAction;

public class LoginCRMApplication {

	@Test(dependsOnMethods={"VerifyForgetPassword"})
	public void LoginWithValidCredential() {
		LoginAction la = new LoginAction();
		la.LoginCRMApplication();
	}
	
	@Test
	public void OpenCRMApp() {
		BrowserAction ba = new BrowserAction();
		WebDriver driver = ba.openBrowser("CHROMe");
		driver.get("http://www.sugarcrm.cyberdroid.biz");		
	}
	
	@Test(dependsOnMethods={"OpenCRMApp"})
	public void VerifyForgetPassword() {
		
		
		LoginAction la = new LoginAction();
		la.verifyForgetPassword();
		
	}
	
	

}

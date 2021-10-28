package com.selenium.automation.site;

import com.selenium.automation.pages.HomePage;
import com.selenium.automation.pages.LoginPage;

public class DemoSite extends Site {

	public LoginPage loginPage;
	public HomePage homePage;
	
	public DemoSite() {
		homePage = new HomePage(getBrowserName(), getUrlSite());
		loginPage = new LoginPage(getUrlSite());
	
	
	}
	
	
	
	public Boolean Login() {
		
		return this.loginPage.Login(getUserName(), getPassword());
		
	}
	
	
	public void CloseSite() {
		homePage.ClosePage();
	}
}

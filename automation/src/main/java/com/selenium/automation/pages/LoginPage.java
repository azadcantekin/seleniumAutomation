package com.selenium.automation.pages;



public class LoginPage extends BasePage{

	protected String urlPage;
	
	
	
	public LoginPage(String url) {
		urlPage = url;
		
	}
	public LoginPage() {
		
	}
	
	
	public Boolean Login(String userName , String password) {
		Boolean result = true;
	    automationTool.GoToPage(urlPage);
		return result;
	}
}

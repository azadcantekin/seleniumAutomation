package com.selenium.automation.pages;


import com.selenium.automation.tools.AutomationTool;

public class HomePage extends BasePage  {

	public static AutomationTool automationTool;
	
	
	
	public HomePage(String browserName , String urlSite) {
		
		automationTool = new AutomationTool();
		automationTool.OpenBrowser(browserName);
		
	}
	
	
	@Override
	public Boolean OpenPage() {
		automationTool.GoToPage(urlPage);
		return true;
	}
	
	
	
	public Boolean ClosePage() {
		automationTool.CloseBrowser();
		return true;
	}
	
	
	
  
	

	
	
	

	
	
}

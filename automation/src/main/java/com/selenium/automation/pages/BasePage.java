package com.selenium.automation.pages;

import com.selenium.automation.tools.AutomationTool;

public class BasePage extends AutomationTool {

	public static AutomationTool automationTool;
	protected String urlPage;
	protected String browserName;
	
	
	public Boolean OpenPage() {
		return true;
	}
	
	public Boolean ClosePage() {
		return true;
	}
	
	
}

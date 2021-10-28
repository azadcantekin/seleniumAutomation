package com.selenium.automation.tools;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.selenium.automation.pages.LoginPage;





public class AutomationTool {

	protected WebDriver driver;
	protected String browserName;
	protected WebElement element;

	

	
	public AutomationTool() {
		
		
	}
	
	public Boolean OpenBrowser(String browserType) {
		if(browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Azad Can Tekin\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return true;
	}
	
	public LoginPage signIn() {
	WebElement signInLink =	driver.findElement(By.linkText("Giriş Yap"));
	signInLink.click();
	return new LoginPage();
	}
	
	public Boolean GoToPage(String urlSite) {
		driver.get(urlSite);
		return true;
	}
	
	
	
	
	public void CloseBrowser() {
		driver.quit();
	}

	

	

	
	}


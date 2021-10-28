package com.selenium.automation.site;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Site {

	private String browserName ; 
	private String urlSite;
	private String userName;
	private String password;
	private Properties prop;
	

   public String getBrowserName() {
		return browserName;
	}


	public String getUrlSite() {
		return urlSite;
	}

	  public String getUserName() {
			return userName;
		}
	public String getPassword() {
		return password;
	}


	public Properties getProp() {
		return prop;
	}


public Site() {
		    	try {
					prop = new Properties();
					FileInputStream ip = new FileInputStream("C:\\Users\\Azad Can Tekin\\eclipse-workspace\\automation\\src\\main\\java\\com\\selenium\\automation\\properties\\config.properties");
					prop.load(ip);
					browserName = prop.getProperty("browser");
					urlSite = prop.getProperty("url");
					userName = prop.getProperty("user");
					password = prop.getProperty("password");
					
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
		    }
		   
	
}

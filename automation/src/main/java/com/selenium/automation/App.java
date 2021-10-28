package com.selenium.automation;


import com.selenium.automation.site.DemoSite;

public class App 
{
    public static void main( String[] args )
    {
  
    	DemoSite site = new DemoSite();
    	site.homePage.signIn();
    
    }
}

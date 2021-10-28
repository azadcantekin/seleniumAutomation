package com.selenium.automation;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.selenium.automation.site.DemoSite;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	DemoSite site = new DemoSite();
    	Boolean result = site.Login();
        assertTrue(result);
        
        
    }
}

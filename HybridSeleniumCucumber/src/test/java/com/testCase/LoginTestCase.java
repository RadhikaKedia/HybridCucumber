package com.testCase;

import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseClass.Library;
import com.pages.LoginPage;
import com.seleniumReusableFunctions.SeleniumUtilities;

public class LoginTestCase extends Library
{
	@BeforeTest
    public void stratUp() 
	{
        launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
       
    }
    @Test(priority = 1)
    public void login() 
    {
        LoginPage lpage=new LoginPage(driver);
        lpage.login("Admin", "admin123");
       
    }
    @AfterMethod
    public void close() throws IOException 
    {
        SeleniumUtilities sUti = new SeleniumUtilities(driver);
        sUti.to_take_screenshot("C:\\Users\\Naidu\\eclipse-workspace\\HybridSeleniumCucumber\\src\\test\\resources\\Screenshots\\orangeHRMLogin.png");
       
        quit();
       
    }

}

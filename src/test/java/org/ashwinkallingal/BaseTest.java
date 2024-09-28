package org.ashwinkallingal;

import org.ashwinkallingal.PageObjects.TravelHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {



    public WebDriver initializeDriver()
    {
    	System.setProperty("webdriver.chrome.driver", "E:\\designPattern\\driver\\chromedriver.exe");   	
        WebDriver driver = new ChromeDriver();

        return driver;
    }





}

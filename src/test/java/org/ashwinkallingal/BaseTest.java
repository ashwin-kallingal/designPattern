package org.ashwinkallingal;

import org.ashwinkallingal.PageObjects.TravelHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {



    public WebDriver initializeDriver()
    {
        WebDriver driver = new ChromeDriver();

        return driver;
    }





}

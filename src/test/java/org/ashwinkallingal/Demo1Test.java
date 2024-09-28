package org.ashwinkallingal;

import dataloads.GetDataUtils;
import org.ashwinkallingal.PageObjects.TravelHomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo1Test extends BaseTest {

    public WebDriver driver;

 

 @Test(dataProvider = "getJData")
 public void flightTest() throws InterruptedException {
	 System.out.println("Hello World");
 
 }
     


}

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

 @BeforeTest
 public void setup()
 {
     driver = initializeDriver();
 }

 @Test(dataProvider = "getJData")
 public void flightTest(HashMap<String, String> reservationDetails) throws InterruptedException {
     TravelHomePage travel = new TravelHomePage(driver);
     travel.gotTo();
     System.out.println(travel.getNavigationBar().selectFlight());
     System.out.println(travel.getFooterNavigation().selectFlight());
     System.out.println(travel.getNavigationBar().getLinkCount());
     System.out.println(travel.getFooterNavigation().getLinkCount());
     travel.setBookingStratergy("roundtrip");
     travel.checkAvail(reservationDetails);

 }


    @DataProvider
    public Object[][] getJData() throws IOException {
        GetDataUtils dataUtils = new GetDataUtils();
        List<Map<String, String>> l = dataUtils.getJsonData(System.getProperty("user.dir")+"/src/test/java/dataloads/data.json");

        return new Object[][] {
                {l.get(0)}, {l.get(1)},
        };
    }




 @DataProvider
 public Object[][] getData(){

     HashMap<String, String> reservationDetails1 = new HashMap<String, String>();
     reservationDetails1.put("origin1", "MAA");
     reservationDetails1.put("dest1", "GOI");
     reservationDetails1.put("origin2", "DEL");
     reservationDetails1.put("dest2", "AMD");

     HashMap<String, String> reservationDetails2 = new HashMap<String, String>();
     reservationDetails2.put("origin1", "MAA");
     reservationDetails2.put("dest1", "GOI");
     reservationDetails2.put("origin2", "DEL");
     reservationDetails2.put("dest2", "AMD");
     List<HashMap<String, String>> l = new ArrayList<>();
     l.add(reservationDetails1);
     l.add(reservationDetails2);

     return new Object[][] {
             {l.get(0)}, {l.get(1)},
     };
 }

 @AfterTest
    public void teardown()
 {
     driver.quit();
 }



}

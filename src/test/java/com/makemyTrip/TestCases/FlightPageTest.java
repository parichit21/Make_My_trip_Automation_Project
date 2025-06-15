package com.makemyTrip.TestCases;

import com.aventstack.extentreports.Status;
import com.makemytrip.base.baseTest;
import com.makemytrip.pages.HomePage;
import org.testng.annotations.Test;

public class FlightPageTest extends baseTest {

    @Test
        public void searchFlight(){
            test = extent.createTest("Validate Search Flight");

            HomePage homePage = new HomePage();

            homePage.seletFlightMenu();
            test.log(Status.INFO,"CLick on Flight menu ");
            homePage.rountTripMenu();
        test.log(Status.INFO,"CLick on round trip menu ");
            homePage.enterDepartureCiy();
        test.log(Status.INFO,"Departure Date entured ");
            homePage.enterReturnCity();
        test.log(Status.INFO,"Return City entured ");
            homePage.enterDepartureDate();
        test.log(Status.INFO,"Departure date entured ");
            homePage.returnDate();
        test.log(Status.INFO,"Returned Date entered  ");
            homePage.searchButton();
        }


}

package com.makemyTrip.TestCases;

import com.makemytrip.base.baseTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class TestSetup extends baseTest {

    @BeforeSuite
    public void setUp() throws IOException {
        readPropertyfile();
        driverInitialization();
        setExtentReport();

    }

    @AfterSuite
    public void tearDown(){
        extent.flush();
        driver.quit();
    }

}

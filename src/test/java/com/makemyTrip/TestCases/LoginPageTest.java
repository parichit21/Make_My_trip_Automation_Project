package com.makemyTrip.TestCases;

import com.aventstack.extentreports.Status;
import com.makemytrip.base.baseTest;
import com.makemytrip.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTest extends baseTest {

    @Test
public void doLogin(){

        test = extent.createTest("Login to book flight");

        LoginPage loginPage = new LoginPage();

        loginPage.login();
        test.log(Status.INFO,"Clicked on Login Link");

        loginPage.EnterMobile();
        test.log(Status.INFO,"Enter mobile number ");

        loginPage.ClickContinue();
        test.log(Status.INFO, "Clicked in Continue");
    }


}

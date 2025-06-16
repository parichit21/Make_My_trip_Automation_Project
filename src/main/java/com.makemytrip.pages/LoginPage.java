package com.makemytrip.pages;

import com.makemytrip.base.baseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPage extends baseTest {
    private static final Logger log = LoggerFactory.getLogger(LoginPage.class);
    @FindBy(xpath = "//p[text()=\"Login or Create Account\"]")
    WebElement login;

    @FindBy(xpath = "//input[@placeholder=\"Enter Mobile Number\"]")
WebElement Entermobile;

    @FindBy(xpath = "//span[text()=\"Continue\"]")
    WebElement continuebtn;

    public LoginPage(){
        super();
        PageFactory.initElements(driver, this);
    }

    public void login(){
        login.click();
    }

    public void EnterMobile(){
        Entermobile.sendKeys("9999332133");
    }

    public void ClickContinue(){
        continuebtn.click();
    }






}

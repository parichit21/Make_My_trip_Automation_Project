package com.makemytrip.pages;

import com.makemytrip.base.baseTest;
import com.makemytrip.util.com.makemytrip.base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class HomePage extends baseTest {

//    Xpath
//flight :- //span//a[@href="/flights/"]

//roundTrip :- //li[contains(text(),'Round Trip')]

    @FindBy(xpath = "//span//a[@href=\"/flights/\"]")
    WebElement flightMenu;

    @FindBy(xpath = "//li[contains(text(),'Round Trip')]")
    WebElement roundTripMenu;

    @FindBy(xpath = "//input[@id='fromCity']")
    WebElement fromCityDropDown;

    @FindBy(xpath = "//*[@id='fromCity']")
 //   @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")
    WebElement searchFromcity;

    @FindBy(xpath ="//*[@id='toCity']")
     // @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input")
    WebElement searchToCity;

    //    depature
 //   @FindBy(xpath = "//*[@for='departure']")
    @FindBy(xpath = "//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div/div[2]/div[1]/div[3]")
    WebElement departureDrop;

    @FindBy(xpath = "//span[text()='Return']")
    WebElement returnDrop;

    String departureDate = "//div[@aria-label='%replace%' and @aria-disabled='false']";
    String Returndate = "//div[@aria-label='%replace%' and @aria-disabled='false']";

    @FindBy(xpath = "//a[contains(@class,'widgetSearchBtn') and text()='Search']")
    WebElement Searchbtn;


    public HomePage(){
        super();
        PageFactory.initElements(driver,this);
    }

    public void seletFlightMenu(){
        flightMenu.click();
    }

    public void rountTripMenu(){
        roundTripMenu.click();
    }
    public void enterDepartureCiy(){
        departureDrop.click();
        searchFromcity.sendKeys(config.getProperty("From"));
        searchFromcity.sendKeys(Keys.TAB);

    }
    public void enterReturnCity(){
        searchToCity.sendKeys(config.getProperty("To"));
        searchToCity.sendKeys(Keys.TAB);
    }

    public void enterDepartureDate(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        departureDrop.click();
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[2]/div")).click();
     //   TestUtil date = TestUtil.getCurrentDateandReturnDate();
    //    driver.findElement(TestUtil.customXpath(departureDate, date.departureDate)).click();
    }

    public void returnDate(){
        returnDrop.click();
        TestUtil date = TestUtil.getCurrentDateandReturnDate();
        driver.findElement(TestUtil.customXpath(Returndate, date.returnDate)).click();
    }

    public void searchButton(){
        Searchbtn.click();
    }

}

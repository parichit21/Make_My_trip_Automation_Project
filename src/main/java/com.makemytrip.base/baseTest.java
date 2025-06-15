package com.makemytrip.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class baseTest {

  public   static Properties config;
  public   static WebDriver driver;

//  for reports
  public static ExtentReports extent;
  public static ExtentSparkReporter htmlReporter;
  public static ExtentTest test;
  public static ExtentTest childTest;


    public void driverInitialization(){
        driver = new ChromeDriver();
        driver.get(config.getProperty("url"));
       // driver.manage().window().fullscreen();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(config.getProperty("pageloadTime"))));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();

    }
    public void readPropertyfile() throws IOException {

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\Property\\config.properties");
        config = new Properties();
        config.load(fis);
    }

    public void setExtentReport(){
        htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"//extentReports//MakeMyTripReports.html");
        htmlReporter.config().setDocumentTitle("MakeMyTrip Automation Report");
        htmlReporter.config().setReportName("Functional Testing");
        htmlReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("hostName", "local host");
        extent.setSystemInfo("Name","Parichit");

    }




}

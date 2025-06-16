package com.makemytrip.util.com.makemytrip.base;

import com.makemytrip.base.baseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestUtil extends baseTest {

    public static String departureDate;
    public static String returnDate;

    public static TestUtil getCurrentDateandReturnDate(){
        TestUtil date = new TestUtil();
        Calendar call = Calendar.getInstance();
        call.add(Calendar.DATE,1);

       String [] dateArr =  call.getTime().toString().split(" ");
        TestUtil.departureDate = dateArr[0]+" "+dateArr[1]+" "+dateArr[2]+" "+dateArr[5];

        call.add(Calendar.DATE,2);
        dateArr = call.getTime().toString().split(" ");
        TestUtil.returnDate = dateArr[0]+" "+dateArr[1]+" "+dateArr[2]+" "+dateArr[5];

return date;
    }
public static By customXpath(String xpath,String parm){
        String rawpath = xpath.replaceAll("%replace%",parm);
        return By.xpath(rawpath);
}

public static String getScreenShort() throws IOException {

        String currentDate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir")+"\\src\\main\\resources\\ScreenShort\\"+currentDate+".png";
        FileHandler.copy(source, new File(destination));
        return destination;
    }




}

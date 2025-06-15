package com.makemytrip.util.com.makemytrip.base;

import com.makemytrip.base.baseTest;
import org.openqa.selenium.By;

import java.util.Calendar;

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


}

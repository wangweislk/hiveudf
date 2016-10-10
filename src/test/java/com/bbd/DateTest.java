package com.bbd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by bbd on 2016/10/10.
 */
public class DateTest {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String str = "2016-01-30";
        Date date = format.parse(str);
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);
        rightNow.add(Calendar.MONTH,-3);
        Date newdate = rightNow.getTime();
        String result = format.format(newdate);
        System.out.println(result);


    }
}

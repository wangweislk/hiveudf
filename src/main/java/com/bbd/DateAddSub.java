package com.bbd;

import org.apache.hadoop.hive.ql.exec.UDF;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by bbd on 2016/10/10.
 */
public class DateAddSub extends UDF{

    /**
     * 对日期进行加减操作
     * @param current_date
     * @param num
     * @return
     */
    public String evaluate(String current_date,int num) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse(current_date);
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);
        rightNow.add(Calendar.MONTH,num);

        Date newdate = rightNow.getTime();
        String result = format.format(newdate);
        return result;
    }

    public static void main(String[] args) throws ParseException {
        System.out.println("hello");
        System.out.println(new DateAddSub().evaluate("2016-10-10",-8));
    }

}

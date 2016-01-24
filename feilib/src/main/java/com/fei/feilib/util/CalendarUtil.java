package com.fei.feilib.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Administrator on 2016/1/22 0022.
 */
public class CalendarUtil {

    public Calendar calendar;
    public int day;

    public CalendarUtil() {
        initDay();
    }

    public void initDay() {
        calendar = Calendar.getInstance();
        day = calendar.get(Calendar.DATE);
    }

    public String getDayBefore() {
        calendar.set(Calendar.DATE, day);

        String dayBefore = new SimpleDateFormat("yyyyMMdd").format(calendar.getTime());
        return dayBefore;
    }

}

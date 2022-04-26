package util;

import java.util.Calendar;
import java.util.Date;

public class Miscellaneous {
    public static Date addMonth(Date date, int n){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, n);
        return calendar.getTime();
    }

}

package team.ruike.cim.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日期辅助类
 */
public class DateUtil {
    /**
     * date2比date1多的天数
     * @param date1 小日期
     * @param date2 大日期
     * @return 天数
     */
    public static int differentDays(Date date1, Date date2)
    {
        return (int) ((date2.getTime() - date1.getTime()) / (1000*3600*24));
    }

    /**
     * 获取系统时间明天的日期
     * @return 日期
     */
    public static Date getNextDate(){
        Date date=new Date();//取时间
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DATE,1);//把日期往前减少一天，若想把日期向后推一天则将负数改为正数
        date=calendar.getTime();
        return date;
    }
}

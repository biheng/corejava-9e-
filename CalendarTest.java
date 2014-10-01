import java.text.DateFormatSymbols;
import java.util.*;

/**
 * @author youkpter
 *2014年 09月 18日 星期四 18:32:52 CST
 */

public class CalendarTest
{
    public static void main(String[] args)
    {
        //construct d as current date
        GregorianCalendar d = new GregorianCalendar();

        int today = d.get(Calendar.DAY_OF_MONTH);
        int month = d.get(Calendar.MONTH);
        int year  = d.get(Calendar.YEAR);

        System.out.println("\t" + month + "月\t" + year);

        //set d to start date of the month
        d.set(Calendar.DAY_OF_MONTH, 1);

        int weekday = d.get(Calendar.DAY_OF_WEEK);

        //get first day of week(Sunday in the U.S)
        int firstDayOfWeek = d.getFirstDayOfWeek();

        //determine the required indentation for the first line
        int indent = 0;
        while(weekday != firstDayOfWeek)
        {
            indent++;
            d.add(Calendar.DAY_OF_MONTH, -1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        }

        //print weekday names
        String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
        
        do
        {//getShortWeekdays()方法生成的String型数组是以星期几(本质就是数值常量，星期日为1)
         //为索引，测试得到weekdayNames[0]为空
         //所以此循环可以直接用for each循环代替
            System.out.printf("%4s", weekdayNames[weekday]);
            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        }while(weekday != firstDayOfWeek);
        System.out.println();

        for(int i = 1; i <= indent; i++)
            System.out.print("    ");

        d.set(Calendar.DAY_OF_MONTH, 1);
        do
        {
            //print day
            int day = d.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d", day);

            //mark current day with *
            if (day == today)
                System.out.print("*");
            else
                System.out.print(" ");

            //advance d to the next day
            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday = d.get(Calendar.DAY_OF_WEEK);

            //start a new line at the start of the week
            if(weekday == firstDayOfWeek)
                System.out.println();
        }while(d.get(Calendar.MONTH) == month);
        //the loop exits when d is day 1 of the next month

        //print final end of line if necessary
        if(weekday != firstDayOfWeek)
            System.out.println();
    }
}

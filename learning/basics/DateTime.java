import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTime
{
	public static void main(String[] args)
	{
		Date currentDate = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("d/M/y");
		SimpleDateFormat ft1 = new SimpleDateFormat ("M/d/y");
		SimpleDateFormat ft2 = new SimpleDateFormat ("w");
		SimpleDateFormat ft3 = new SimpleDateFormat ("W");
		SimpleDateFormat ft4 = new SimpleDateFormat ("D");
		
		System.out.println("Current date is : " + ft.format(currentDate));
		System.out.println("Current date is : " + ft1.format(currentDate));
		System.out.printf("%s %tA %<tB %<td %<tY", "Current date is :", currentDate);
		System.out.println();
		System.out.printf("%s %ta %<tB %<td %<tI:%<tM:%<tS %<Tp %<tZ %<tY", "Current date and time is :", currentDate);
		System.out.println();
		System.out.printf("%s %td/%<tm/%<ty %<tI:%<tM:%<tS %<Tp %<tz", "Current date and time is :", currentDate);
		System.out.println();
		System.out.printf("%s %tI:%<tM:%<tS", "Current time is :", currentDate);
		System.out.println();
		System.out.println("Current week of year is : " + ft2.format(currentDate));
		//System.out.println();
		System.out.println("Current week of month : " + ft3.format(currentDate));
		//System.out.println();
		System.out.println("Current day of the year is : " + ft4.format(currentDate));
		//System.out.println();
	}
}

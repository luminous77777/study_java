package lesson12_2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static java.util.Calendar.*;

import java.text.SimpleDateFormat;

import static java.lang.System.in;

public class CalendarEx {
	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = new GregorianCalendar();
		Calendar cal3 = getInstance();
//		System.out.println(cal1);
//		System.out.println(cal2);
		Scanner scanner = new Scanner(in);
		
		System.out.println(cal1.get(Calendar.YEAR));
		System.out.println(cal1.get(ERA));
		System.out.println(cal1.get(YEAR)+"년");
		System.out.println(cal1.get(MONTH)+1+"월");
		System.out.println(cal1.get(DATE)+"일");
		System.out.println(cal1.get(HOUR)+"시");
		System.out.println(cal1.get(MINUTE)+"분");
		System.out.println(cal1.get(SECOND)+"초");
		System.out.println(cal1.get(DAY_OF_WEEK));//요일
		
		
		cal1.set(YEAR, 2077);
		System.out.println(cal1.get(Calendar.YEAR));
		System.out.println(cal1.get(ERA));
		System.out.println(cal1.get(YEAR)+"년");
		System.out.println(cal1.get(MONTH)+1+"월");
		System.out.println(cal1.get(DATE)+"일");
		System.out.println(cal1.get(HOUR)+"시");
		System.out.println(cal1.get(MINUTE)+"분");
		System.out.println(cal1.get(SECOND)+"초");
		System.out.println(cal1.get(DAY_OF_WEEK));//요일
		
		cal1.set(MONTH, 2);
		cal1.getActualMaximum(YEAR);
		System.out.println(cal1.getActualMaximum(DATE));
		
		cal1.add(MONTH, -10);
		printCal(cal1);
	}
	
	static void printCal(Calendar cal) {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cal.getTime()));
	}
}

package lesson12_api;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import static java.util.Calendar.*;//쉬워지는접근

public class CalendarEx {
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar(); //추상클래스라..자식을통하거나 메서드를이용해야함..?!!
		Calendar cal2 = Calendar.getInstance();
		
		// cal -> date
		Date date = new Date(cal.getTimeInMillis());
		date.setTime(cal.getTimeInMillis());
		
		// date -> cal
		cal.setTimeInMillis(date.getTime());
		
		// 주요메서드
		cal.getActualMaximum(2);//달의 마지막일 구할때 사용
		
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		System.out.println(cal.get(ERA));
		System.out.println(cal.get(MONTH));
		System.out.println(cal.get(DATE));
		System.out.println(cal.get(DAY_OF_MONTH));
	//	cal.set(DATE, 15);
		System.out.println(cal.get(DAY_OF_WEEK));//6  .. 일요일 1 , 토요일 7
		System.out.println(cal.get(DAY_OF_WEEK_IN_MONTH)); //주차계산에 이용
		System.out.println(cal.get(ZONE_OFFSET) / 1000 / 60 / 60); // UTC(GMT)+9의 9를 구할 수 있음
		

	}
}

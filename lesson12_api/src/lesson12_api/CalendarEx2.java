package lesson12_api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarEx2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(new Date(cal.getTimeInMillis())));
		
		//10000일 이전 구하기
		cal.add(Calendar.DATE, -10000);
		System.out.println(sdf.format(new Date(cal.getTimeInMillis())));
		cal.add(Calendar.MONTH, 200);
		System.out.println(sdf.format(new Date(cal.getTimeInMillis())));

		//달은 고정하고 날짜 고정 (나머지계산)
		cal.roll(Calendar.DATE, 4); 
		System.out.println(sdf.format(new Date(cal.getTimeInMillis())));
	}
}

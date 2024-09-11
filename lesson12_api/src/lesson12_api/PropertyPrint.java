package lesson12_api;

import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Set;

public class PropertyPrint {
	public static void main(String[] args) {
//		Properties props = System.getProperties();
//		Set<?> keys = props.keySet();
//		for(Object o : keys) {
//			String key = o.toString();
//			System.out.printf("%s ::::: %s\n", key, System.getProperty(key));//운영체제관련정보
//		}
		
		
		// epoch(unix) time : 1970.01.01 00:00:00 0 / 이 이후로 지난 ms 
		// 이걸로 날짜계산 가능 시작종료타임 체크 등
		System.out.println(System.currentTimeMillis()); //long
		System.out.println(new Date().getTime());		
		//System.out.println(Calendar.getInstance().getTimeInMillis());
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, Calendar.DECEMBER);
		cal.set(Calendar.DATE, 25); //크리스마스
		
		long between = cal.getTimeInMillis() - System.currentTimeMillis();
		System.out.println(between / 1000 / 60 / 60 / 24);
		
	}
}

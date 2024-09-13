package lesson12_api;

import java.text.SimpleDateFormat;
import java.util.Date;

// Date 1.0
// Calendar 1.1

public class DateEx {
	public static void main(String[] args) {
		
	Date date = new Date(); //현재
	System.out.println(date);
	
	//format
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	System.out.println(sdf.format(date));
	
	// 특정날짜 및 시간 + 3000일 등에 사용
	long target = date.getTime() + 3000L * 24 * 60 * 60 * 1000;
	System.out.println(new Date(target));
	System.out.println(date.getYear() + 1900); // 이래서잘안씀
	
	Date chirstmas = new Date(123, 11, 25, 0, 0, 0); //노추천
	System.out.println(chirstmas);
	//에포크. 짝대기있는 경우가 많음
	}
}

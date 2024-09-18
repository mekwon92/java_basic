package lesson12_api.homework;

import java.util.Calendar;

public class CalenderExer {
	public static void main(String[] args) {
		//1달력 출력 (최소 이번달)
		//2이전달, 3다음달, 4이전해, 5다음해, 6특정 연월 입력시 simpleformat, parse 이용해서 그 위치의 달력을 출력
		
		//이번달
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.get(Calendar.YEAR)+"년" + (cal.get(Calendar.MONTH)+1)+"월");
		
		System.out.println("sun mon tue wed thu fri sat");
		for(int i = cal.getActualMinimum(Calendar.DATE); i <= cal.getActualMaximum(Calendar.DATE); i++) {
			cal.set(Calendar.DATE, i);
			System.out.printf("%4d",cal.get(Calendar.DATE));
			if(cal.get(Calendar.DAY_OF_WEEK) == 7) {
				System.out.println();
			}
		}
		System.out.println();
		//다음달...ㅠ 공백을......?!!
		cal.set(Calendar.MONTH,9);
		System.out.println(cal.getTime());
		System.out.println(cal.get(Calendar.YEAR)+"년" + (cal.get(Calendar.MONTH)+1)+"월");
		System.out.println("sun mon tue wed thu fri sat");
		for(int i = cal.getActualMinimum(Calendar.DATE); i <= cal.getActualMaximum(Calendar.DATE); i++) {
			cal.set(Calendar.DATE, i);
			System.out.printf("%4d",cal.get(Calendar.DATE));
			if(cal.get(Calendar.DAY_OF_WEEK) == 7) {
				System.out.println();
			}
		}
		
	}

}

package lesson12_api.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarExerT {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws ParseException {
		Calendar cal = Calendar.getInstance(); //24년 9월 1일이 필요
		cal.add(Calendar.MONTH, 0);
		//연,월,마지막날짜,시작날짜의 요일
		//int year = cal.get(Calendar.YEAR);
		//int month = cal.get(Calendar.MONTH);
		while (true) {
			System.out.println("1. 이전달 2. 다음달 3. 이전해 4. 다음해 5. 달지정(검색)");
			switch (Integer.parseInt(scanner.nextLine())) {
			case 1 :
				cal.add(Calendar.MONTH, -1);
				break;
			case 2 :
				cal.add(Calendar.MONTH, 1);
				break;
			case 3 :
				cal.add(Calendar.YEAR, -1);
				break;
			case 4:
				cal.add(Calendar.YEAR, 1);
				break;
			case 5:
//				System.out.println("연도입력 > ");
//				cal.set(Calendar.YEAR, scanner.nextInt());
//				System.out.println("월 입력 > ");
//				cal.set(Calendar.MONTH, scanner.nextInt()-1);
				System.out.println("연도,월을 입력해주세요 ex)2024/09 > ");
				String str = scanner.nextLine();
				cal.setTime(new SimpleDateFormat("yyyy/MM").parse(str));
				break;
			default:
				break;
			}
			printCal(cal);
			System.out.println();
		}
	}

	static void printCal(Calendar cal) {
		System.out.println(cal.get(Calendar.YEAR) + "/" + (cal.get(Calendar.MONTH)+1));
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		cal.set(Calendar.DATE, 1);
		int startDay = cal.get(Calendar.DAY_OF_WEEK);
		
		for(int i = 1 - startDay + 1 ; i <= lastDate ; i++) {
			if(i > 0) {
				System.out.printf("%4d",i);
			}
			else {
				System.out.print("    ");
			}
			if(i % 7 == (7 - startDay + 1) % 7) {
				System.out.println();
			}
				
		}
	}
}

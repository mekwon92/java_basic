package lesson4_operator;

public class Exer {
	public static void main(String[] args) {
		
	
	//1번문제 풀이
	// += : 우측항의 값을 좌항값에 더하여 좌항에 대입
	// -= : 우측항의 값을 좌항값에 빼서 좌항에 대입
	// %= : 우측항의 값을 좌항값에 나눈 나머지 좌항에 대입
	
	//2번문제 풀이
		System.out.println(7 - 1 * 20 / 5);
		
	//3번문제 풀이
		int colorpen = 5 * 12;
		int studentCount = 27;
		
		int divColorPen = colorpen / studentCount;
		System.out.println("학생당 색연필수" + divColorPen);
		
		int remaincolor = colorpen % studentCount;
		System.out.println("학생당 색연필수" + remaincolor);
	
	//4번문제 풀이
		int age = 8; 
		int height = 110;
		boolean parent = true;
		boolean hearchDease = true;
		boolean result = age >= 6 && height >= 120 ||parent && height >= 120 && !hearchDease;
		//짧게 정리(분배법칙)
		result = height >= 120 && (age >= 6 || parent) && !hearchDease;
		System.out.println(result);
		
	//5번문제 풀이
		int year = 2000;
		boolean leapyear = year % 4 == 0 && year % 100 !=0 || year % 400 == 0;
	
	//6번문제 풀이
		int price = 187000;
		int oman = price / 50000;
		int ilman = price % 50000 / 10000;
		int ochun = price % 10000 / 5000;
		int ilchun = price % 5000 / 1000;
		
		System.out.println("5만원권 : " + oman + "장");
		System.out.println("1만원권 : " + ilman + "장");
		System.out.println("5천원권 : " + ochun + "장");
		System.out.println("1천원권 : " + ilchun + "장");
	
	//7번문제 풀이
		int num = 1234;
		int result7 = num / 100 * 100;
		System.out.println(result7);	
	}
}

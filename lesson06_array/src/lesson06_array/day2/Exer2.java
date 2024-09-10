package lesson06_array.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Exer2 {
	public static void main(String[] args) {
//지폐, 동전 세기
		int money = 123456;
		int[] units = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int[] counts = new int[10];
		//{2,2,0,3,0,4,1,0,1,1}의 결과 값이 나올 수 있도록

		//돈에서 50000원 나눈 몫을 배열0번에 저장
		
		/*
		for(int i = 0; i < counts.length ; i++) { //인덱스 번호는 0~9 까지. 나누는값은 처음에 50000 나누기 5 나누기 2
		counts[i] = money / units[i];
		money = money - units[i] * ( money / units[i]);
		}
		
	
		System.out.println(Arrays.toString(counts));
		*/
		
		/*for(int i = 0; i < counts.length ; i++) { 
			counts[i] = money / units[i];
			money %= units[i];
		}
		
		for(int i = 0; i < counts.length ; i++) {
			System.out.printf("%d원 %d" + (units[i] >= 1000 ? "장" : "개") + "\n", units[i], counts[i]);
		}*/
		
		
		
			
//사람 이름을 입력받음
//입력 글자 중 q를 입력하면 입력 종료
//사람 이름들을 문자열 배열 만들어서
//프로그램 종료직전 확인가능하게
		
		
/*	
		String[] arr = new String[4];
		
		
		for(int i = 0; ; i++) {
			System.out.print("이름을 입력하세요>");
			arr[i] = scanner.nextLine();
			System.out.println(Arrays.toString(arr));
			
			if(arr[i].equals("q")) {
				System.out.println("종료");
				break;
			
			}
		} */
		
		Scanner scanner = new Scanner(System.in); //참조형 변수명은 클래스 대문자를 소문자로 바꾸는 걸 추천
		String[] strings = new String[3];
//		String[] temp = {"abc", "def"};
//		temp = Arrays.copyOf(temp, temp.length * 2);
//		System.out.println(Arrays.toString(temp));
		
		for(int i = 0 ;; i++) {
			System.out.print("이름입력>");
			String str = scanner.nextLine(); //int도 입력은 nextLine으로 받는 것을 추천 개행까지만 인식해서 버그줄임
			if(str.equals("q")) {
				System.out.println("bye");
			 // strings = Arrays.copyOf(strings, i); //이렇게하면 82번이 생략 가능?!
				break;
			}
			if(strings.length == i) {
				System.out.println("문제 발생 직전");
				strings = Arrays.copyOf(strings, strings.length * 2);
			}
			strings[i] = str; //최소 해당 인덱스에 접근 전에 배열 크기를 늘려야함
		}
		
		for(String s : strings) {
		if(s == null) break; // if( s != null)
			System.out.println(s);
		}
		//클래스변수//
		//Integer.M 동그라미 비워져잇으면 변수임 ~ Static Final
		//Byte는 클래스 대문자로 시작 byte는 자료형...
		//변수는 공간이 없음.... 클래스를 활용해야함!!! 각각의 멤버가 존재함
		//Integer Chracter Byte
	}
}

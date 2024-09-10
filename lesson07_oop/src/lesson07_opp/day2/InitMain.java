package lesson07_opp.day2;

import java.util.Arrays;

public class InitMain {
	
	int num = 10;
	int[] arr = new int[10];
	static int[] arr2 = new int[10];
	//class에서 for문 등 호출 시행 불가능... 블럭 내에서 해야됨
	public InitMain() {
		System.out.println("생성자");
		System.out.println(Arrays.toString(arr));
	}
	{
	
	}
	{
		System.out.println("초기화 블럭");//2nd 인스턴스를 생성하는만큼 (초기화 사전설정,필드초기화)
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100);
		}
		System.out.println(Arrays.toString(arr2));
	}
	static {
		System.out.println("클래스 초기화 블랙"); //1st젤빠름.. 딱 한번 실행.. 사라지지않음 고정
		for(int i = 0 ; i < arr2.length; i++) {
			arr2[i] = (int)(Math.random() * 100);
		}}
	public static void main(String[] args) {
		System.out.println("메인시작");
		InitMain initMain = new InitMain();
		InitMain initMain2 = new InitMain();
		new InitMain();
		System.out.println("메인 끝");
	}

}
/*
 * method area
 * 메서드,클래스 설계도 클래스변수관리
 * call stack <
 * 지역변수관리
 * heap(new)
 * 인스턴스변수관리*/

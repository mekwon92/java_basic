package lesson5_control;

import java.util.Scanner;

//가위바위보 게임
public class SwitchEx3 {
	public static void main(String[] args) {
		//가위 1, 바위 2, 보 3
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위(1), 바위(2), 보(3) 중에 하나를 선택하세요.>");
		int me = scanner.nextInt();
		
		int com = (int)(Math.random() * 3) +1;
		
		switch(me - com) {
		case -2 : case 1:
			System.out.println("이겼습니다");
			break;
		case 0:
			System.out.println("비겼습니다");
			break;
		default :
			System.out.println("졌습니다");
		}
		System.out.println("나의 패 : " + me + ", 컴퓨터의 패 : " + com);
	}
}

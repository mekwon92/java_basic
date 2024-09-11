package student;

import java.util.Scanner;

//UI
//CRUD : Create Read(배열?) Update Delete
//학번으로 구분.......
public class StudentMain{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StudentService ss = new StudentService();
		int input = 0;
		while(true) {
			try {
				input = StudentUtils.nextInt("1. 조회 2.등록 3.수정 4.삭제 5.종료");
				if(input <= 0 || input >= 5) {
					System.out.println("잘못된 입력입니다. 1~5번 중 선택하세요");
				}				
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 1~5번의 숫자를 입력하세요");
				
			}
			switch(input) {
			case 1:
				System.out.println("조회");
				ss.list();
				 break;
			case 2:
				ss.add();
				System.out.println("등록");
				break;
			case 3:
				ss.modify();
				System.out.println("수정");
				break;
			case 4:
				ss.remove();
				System.out.println("삭제");
				break;
			case 5:
				System.out.println("bye");
				break;
			default:
				break;
			}
		}
	}
}

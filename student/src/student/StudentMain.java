package student;

import java.util.Scanner;

//UI
//Create Read(배열?) Update Delete
//배열길이 늘리는 과제 + car배열?... 학번으로 구분.......
public class StudentMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StudentService ss = new StudentService();
		while(true) {
			int input = StudentUtils.nextInt("1. 조회 2.등록 3.수정 4.삭제 5.종료");
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

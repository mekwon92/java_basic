package student;

import java.util.Scanner;

//UI
//CRUD : Create Read(배열?) Update Delete
//학번으로 구분.......
//로직은 로직구간만 담당하고 서비스는 예외를 던지고 메인이 받도록 해야됨
public class StudentMain{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StudentService ss = new StudentService();
	
		while(true) {
			try {
				int input = ss.checkRange(StudentUtils.nextInt("1. 조회 2.등록 3.수정 4.삭제 5.종료"),1,5);	//객체로하거나 클래스만들거나
				switch(input) {
				case 1:
					ss.list();
					 break;
				case 2:
					ss.add();
					ss.cloneAndSort();
					break;
				case 3:
					ss.modify();
					ss.cloneAndSort();
					break;
				case 4:
					ss.remove();
					ss.cloneAndSort();
					break;
				case 5:
					System.out.println("bye");
					break;
				default:
					break;
				}
			} 
			catch (NumberFormatException e) {
				System.out.println("정확한 숫자를 입력하세요");
				
			}
			catch(RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
		
		
	}
}

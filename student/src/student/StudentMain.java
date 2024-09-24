package student;

import java.io.IOException;

//UI
//CRUD : Create Read(배열?) Update Delete
//학번으로 구분.......
//로직은 로직구간만 담당하고 서비스는 예외를 던지고 메인이 받도록 해야됨
public class StudentMain{
	public static void main(String[] args) throws IOException {
		StudentService ss = new StudentService();
	
		while(true) {
			try {
				int input = StudentUtils.next("1. 조회 2.등록 3.수정 4.삭제 5.종료", Integer.class, t -> t >= 1 && t <= 5 , "1~5 사이의 수" );
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
					return;
				default:
					break;
				}
			} 
			catch (NumberFormatException e) {
				System.out.println("정확한 숫자를 입력하세요");
				
			}
			catch(RuntimeException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		
		
	}
}

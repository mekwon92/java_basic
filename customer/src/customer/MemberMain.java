package customer;

import java.util.Scanner;

public class MemberMain {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		MemberService ms = new MemberService();
		while(true) {
			 System.out.println(ms.members);
			 System.out.println("1.로그인 2.회원가입");
			 int input = Integer.parseInt(scanner.nextLine());
			 switch(input) {
			 case 1:
				 ms.login();
				 break;
			 case 2:
				 ms.add();
				 break;
			 default:
				 break;
			 }
			 while(ms.loginMember != null) { //getter로 처리?
				 int input2 = Integer.parseInt(scanner.nextLine()); //나중에 메서드로 처리..?
				 switch(input2) {
				 case 1:
					 ms.logout();
					 break;
				 case 2:
					 ms.remove();
				 default:
					 break;
				 }
			 }
		}
	}
}

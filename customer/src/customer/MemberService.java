package customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MemberService {
	Scanner scanner = new Scanner(System.in);
	List<Member> members = new ArrayList<Member>(); //모든회원
	Member loginMember; //현재 로그인한 사용자
	//null >> 비로그인 not null >> 로그인한 사용자 정보
	
	void login() {
		System.out.println("아이디 > ");
		String id = scanner.nextLine();
		Member m = findBy(id);
		if(m == null) { //아이디 틀림
			System.out.println("입력한 회원의 아이디가 존재하지 않습니다.");
			return;
		}
		System.out.println("비밀번호 > ");
		String pw = scanner.nextLine();
		if(m.getPw().equals(pw)) {
			loginMember = m ; // 성공
		}
		else {//비번틀림
			System.out.println("입력한 회원의 비밀번호가 틀렸습니다.");
		}
	}
	
	
	
	void add() {
		System.out.println("아이디 > ");
		String id = scanner.nextLine();
		Member m = findBy(id);
		if(m!=null) {
			System.out.println("입력한 아이디가 존재합니다");
			return;
		}
		System.out.println("이름 > ");
		String name = scanner.nextLine();
		System.out.println("비밀번호 > ");
		String pw = scanner.nextLine();
		
		members.add(new Member(id,name,pw));
		
	}
	
	void logout() {
		loginMember = null;
		System.out.println("로그아웃되었습니다.");
	}
	
	void remove() {
		members.remove(loginMember);
		logout();
	}
	
	
	Member findBy(String id) {
		for(Member m : members) {
			if(m.getId().equals(id)){
				return m;
			}
		}
		return null;
	}






}

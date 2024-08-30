package lesson03_variable;

public class StringEX {
	public static void main(String[] args) {
		
		String name;
		name = "홍길동";
		String name2 = "홍길동";
		String name3 = null;
		String name4 = ""; // null대신 쓰임
		
		System.out.println("name2:"+name2); //shift ctrl 방향키 : 한 단어 선택
		System.out.println("name3:"+name3); //shift end / home : 한줄선택
		System.out.println("name4:"+name4);
		System.out.println("name4:"+name4); //alt + 방향키 : 소스 이동		
	
		int num = 10;
		System.out.println(num+"");
	}
}

package lesson07_oop;

public class VarEx {
	public static void main(String[] args) {
		System.out.println("Avante 제조사 : " +  Avante.company);
		
		
		Avante a1 = new Avante(); // 객체의 공간을 꼭 마련해줘야함!
		Avante a2 = new Avante();
		
		a1.color = "화이트";
		a2.color = "블랙";
		
		System.out.println("a1 색상 : " + a1.color);
		System.out.println("a2 색상 : " + a2.color);
		
		System.out.println("a1 제조사 : " + a1.company); // 객체로 접근해서 노란줄
		System.out.println("a2 제조사 : " + a1.company); 
	
		a1.company = "기아";
		
		System.out.println("Avante 제조사 : " + Avante.company); // 클래스로 접근해서 정상
		System.out.println("a1 제조사 : " + a1.company);
		System.out.println("a2 제조사 : " + a2.company);
	
	}

}

class Avante {
	String color;
	static String company = "현대"; //클래스로 접근하려면 static 필요
}


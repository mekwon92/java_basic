package lesson07_oop;

public class CarMain {
	public static void main(String[] args) {
		
		Car tico = new Car();
		Car pride = new Car();
		
		
		tico.color = "화이트";
		tico.company = "대우";
		tico.type = "경차";
	//  color = ""; 사용불가
	//  String color = ""; 클래스 color와 무관함. 우연히 같은이름
		
		
		pride.color = "블랙";
		pride.company = "기아";
		pride.type = "소형";
		
		tico.go(); //메서드 호출
		pride.go();
		System.out.println(tico.color);
		System.out.println(tico.company);
		System.out.println(tico.type);
		System.out.println(pride.color);
		System.out.println(pride.company);
		System.out.println(pride.type);
		
	}
}

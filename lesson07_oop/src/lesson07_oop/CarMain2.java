package lesson07_oop;

public class CarMain2 {
	public static void main(String[] args) {
	//클래스변수없이 인스턴스변수와 지역변수가 사용됨	
	
	Car[] cars = new Car[3]; // new 연산자로 공간확보. cars 에는 주소값(Ox100)이 들어감 
							 // 0x100에 3개의 배열이 생성되어있고 칸 마다 null
							 // car 의 필드멤버 가로공간 3칸 생성(string 기본값 null)
	
	Car tico = new Car();    // 새로운 주소를 받은 tico (0x200)
	
	tico.color = "화이트";
	tico.company = "대우";
	tico.type = "경차";      // (0x200위치에 각각의 정보가 저장됨)
	
	//모든 인덱스에 tico 객체 저장
	
	for(int i = 0 ; i < cars.length ; i++) {                      // 아까만든 배열 3칸 모두 tico 주소값이 들어감
		cars[i] = tico;
	}
	
	System.out.println("0번 인덱스 color" + cars[0].color);
	System.out.println("2번 인덱스 color" + cars[2].color);       // 0,1,2번인덱스 모두 0x200 저장

	cars[0].color = "블랙";	// 0번인덱스에 적힌 0x200에 가서 값을 블랙으로 변경
	
	System.out.println("0번 인덱스 color" + cars[0].color);
	System.out.println("2번 인덱스 color" + cars[2].color); 
	
	Car pride = new Car(); // 새로운 프라이드 0x300에 내용 저장
	pride.color = "블랙";
	pride.company = "기아";
	pride.type = "소형";
	
	cars[2] = pride; // 2번인덱스만 0x300, 0,1번인덱스는 0x200
	
	cars[0].color = "레드"; // 0번을 가리키는 0x200의 값을 레드로 변경
	System.out.println("0번 인덱스 color" + cars[0].color); // 레드
	System.out.println("2번 인덱스 color" + cars[2].color); // 블랙
	
	
	
	}
}

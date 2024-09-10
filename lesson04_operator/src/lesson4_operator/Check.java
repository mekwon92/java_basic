package lesson4_operator;

public class Check {
	
	public static void main(String[] args) {
		
		//사과 123개 상자 당 10개씩 들어간다. 몇개의 상자가 필요한가?
	int apple = 123;
	int box = 19;
	
	int result2 = apple % box == 0 ? apple / box : apple / box + 1;
	
	int result3 = (apple + (box-1)) / box;
	
	System.out.println(result2);
	
	System.out.println(result2 + "개가 필요합니다.");
	System.out.println(result3 + "개가 필요합니다.");
	
	// 소수점 자르기 (반올림) : 셋째 자리로
	// 3.141592 
	// 3.142
	double pi = 3.141592;
	System.out.println((int)(pi * 1000) / 1000d); // 단순히 자르기
	System.out.println((int)(pi * 1000 + 0.5) / 1000d); // 셋째 자리로 반올림
	System.out.println();
	//단순히 자르기 자세히
	System.out.println((int)(pi * 1000)); // 3141.592로 소숫점 옮긴 뒤 int형으로 변환 -> 3141
	System.out.println((int)(pi * 1000) / 1000d); // 3141 에서 1000 나누기
	System.out.println();
	//반올림 자세히
	System.out.println((int)(pi * 1000 + 0.5)); // 3141.592에 반올림되도록 +0.5 = 3142.092로 만들어서 int형으로 변환 -> 3142 
	System.out.println((int)(pi * 1000 + 0.5) / 1000d);
	System.out.println();
	
	
	//1_000_000 으로 숫자구분 가능함.
	System.out.println();
	int num1 = 1_000_000 * 1_000_000 / 1_000_000; // 오버플로우 발생
	long num2 = 1_000_000 * 1_000_000 / 1_000_000; // int끼리 계산하면 int값임. long에 들어가기 전에 오버플로우됨
	long num3 = 1_000_000L * 1_000_000 / 1_000_000; // L을 붙여주자
	int num4 = 1_000_000 / 1_000_000 * 1_000_000;
	
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);
	System.out.println(num4);
	}
}

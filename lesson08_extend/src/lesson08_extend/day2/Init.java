package lesson08_extend.day2;
//호출스택의 오버플로우..예외처리도 불가능함....
public class Init {
	private static Init init = new Init();
	public Init() {
		System.out.println("초기화");
	}	
	//Init init = new Init(); //얘를 초기화..나도초기화..계속초기화... 강제종료됨
	
	public static void main(String[] args) {
		new Init(); //초기화..
	}
}
//2		main(args); //메서드의 스택 오버플로우
		
		
		//재귀.. 반복을 대체할 수 있다.....하지만 잘 안씀~ for문이 더 빨라
//		System.out.println(fact(6));
//		
//		int result = 1;//for문이 더 빨라요
//		for(int i = 2; i <= 6; i++) {
//			result *= i;
//		}
//		System.out.println(result);
//	
//	}
//	
//	static int fact(int i) {
//		if( i == 1 ) {
//			return 1;
//		}
//		int result = fact(i - 1) * i;
//		return result;
//	}


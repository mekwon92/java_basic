package lesson07_oop;

public class MethodMain {
	public static void main(String[] args) {
	
		//클래스를 불러오려면 static필요...
		
		Param p = new Param();
				  
		
		//객체로 받는다.
				    //대입연산자는 여기서 대기		
		/*int result = p.add(10, 20);//10, 20 : argument
		System.out.println(result);
		System.out.println(p.add(30, p.add(30, 20)));
		System.out.println(p.add(30, 40));
		System.out.println(new Param().add(40, 50)); //1회성으로 호출하는방법
		
		//클래스로 받는다
		int b = Param.add2(10, 90);
		System.out.println(b);
		System.out.println(Param.add2(40, 90));
		*/
		
		
 
		/*int c = Param.max(new int[] {10, 20, 30, 4, 1, 50});
		System.out.println(c);
		System.out.println(Param.max(new int[] {}));
		System.out.println(Param.max(null)); //이것도 형식상으로는 가능하지만..... 클래스에서 막아주자 유효성검증..
		*/
		
		//가변인자
		Param.min(1,2,3,4,5,6,7,8); //몇개를 넣어도 상관없음
		System.out.println(Param.min(5,2,4,5,6));
		System.out.println(Param.min());
		System.out.println(Param.min(new int[] {3,4,5}));
		
		//대표적인 가변인자
		System.out.printf("%d", 123, 21, 1, "가나다라");
			
		System.out.println();
		
		//chaining하기좋은 java~ 가독성이 좋음				
		String str = "가나다라";
		String s1 = str
				.substring(0, 2) //substring : 0이상 2미만 .....가나
				.concat("AB") // concat : 글자 붙이고싶을때 +랑 같은데 연속적으로하고싶을때 .....가나AB
				.substring(1, 3);  //거기서 1이상3미만 자름 .....나A
		System.out.println(s1);	
	}
}


//return 이후에는 추가적인 작업 안하고 호출자로 돌아감~

class Param {
	int add(int a, int b) { // a, b: parameter
		return a+b;
	}
	
	
	
	static int add2(int a, int b) {
		return a+b;
	}
	
	
	//최대값
	static int max(int[] arr) {
		if(arr == null || arr.length == 0) { //null을 앞에 보내줘야됨
			return -1; // 유효성 검증...... 몰겟으
		}
		int ret = arr[0];
		for(int i : arr) {
			if(ret < i) {
				ret = i;
			}
		}
		return ret;
	}
	
	//최소값(가변인자...는 어떤수가 나오는지 모를 때 배열로 만들어짐!!)
	static int min(int... num) { //num은 배열~~
			if(num == null || num.length == 0) { 
				return -1;
			}
			int ret = num[0];
			for(int i : num) {
				if(ret > i) {
					ret = i;
					}
			}
			return ret;
		}
			
}

// parameter - argument
// 변수 - 리터럴
// 객체 - 인스턴스
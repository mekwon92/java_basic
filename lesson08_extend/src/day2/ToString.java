package day2;
//toString..
public class ToString {
	
	public String toString() {
		return "재정의된 내용"; //없을때확인..
	}
	
	public void print() {
		System.out.println(super.toString()); // super 또한 계층간에 사용됨..사용될일 거의없음..
		System.out.println(this.toString());  //보통 생략(지역에서 먼저 찾아보고 필드에서 찾아보고 조상필드에서 찾음 없으면 오류)
											  //instance에서만 사용됨. class에서못씀.
	}
	public static void main(String[] args) {
		//toString() : 객체의 내용을 문자열로 확인할 때 자동 호출되는 메서드
		Object object = new Object();
		System.out.println(object);
		System.out.println(object.toString());
		
		ToString ts = new ToString();
		System.out.println(ts);
		System.out.println(ts.toString());
	
	}

}

package lesson08_extend;

public class SmartPhone extends Phone{ //이걸통해 phone의 내용을 쓸수있는것(오브젝트랑 소속멤버들) 

	
	public SmartPhone() {
	}

	public SmartPhone(String name, String color, String company) {
		super(name, color, company);
		
	}

	void installApp() {
		System.out.println("앱 설치"); //이거하나만 추가된것 뿐...
	}
}
//~~은 ~~이다.는 상속 스마트폰은 폰이다.
//~은 ~을 가지고있다. 는 포함 원은 점을 가지고있다...??

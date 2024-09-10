package lesson08_extend.day2;
//<->프로토타입. 생성때마다 확인..? 미니프로젝트할때..한개의객체로 재사용....뭔말이ㅑ!!!!!!!!!!!!!!!!!!!!!,ㅡㅡㅋ
public class Singleton {
	private static Singleton singleton = new Singleton();
	private  Singleton() {}	//인스턴스가 아닌 클래스메서드만 가능...
	
	
	public static Singleton getInstance() {
		return singleton; //형식상 만들 수 잇지만 외부에서 접근 불가능하니까 static 붙여야됨
	}

}

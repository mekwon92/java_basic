package day2;

public class Main {
	int i;
	static int si;
	
	void run() {
		System.out.println(i);//this.i 가능
		System.out.println(si);//this.si 보다 Main.si로 접근해야됨
		System.out.println(this);//인스턴스에서 클래스 사용가능
	}
	static void sRun() {
		//System.out.println(i); //클래스에서 인스턴스 불가능,,인스턴스 공간이없기때문에 생성이 안되어있어서........
		//System.out.println(this); //this는 인스턴스의 주소...?이기때문에 불가능.........
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		//System.out.println(InitMain.arr2.length); //클래스초기화블랙
		Main.sRun();
		//Class cls = InitMain.class; //클래스리터럴
		//Class cls = Class.forName("day2.InitMain"); //뭔소리야..
	}
}

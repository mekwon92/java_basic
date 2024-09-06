package lesson08_extend;
//alt s 해서...
public class SmartPhoneMain {
	public static void main(String[] args) {
		Phone p = new Phone("전화기", "화이트", "현대");
		System.out.println(p);
		p.call();
		p.receive();
		p.color = "빨강"; //필드에 직접접근은 위험.........메서드를 통해 접근해야함....
		SmartPhone sp = new SmartPhone("갤럭시","블랙","삼성");
		System.out.println(sp);
		sp.call();
		sp.receive();
		sp.installApp();
	}

}

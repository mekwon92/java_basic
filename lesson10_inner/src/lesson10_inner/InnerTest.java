package lesson10_inner;

public class InnerTest {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner(); //inner은 개별 인스턴스를 통해 접근
		
		Outer.SInner sInner = new Outer.SInner();//클래스이름으로 접근해야됨.
	}
}


class Outer {
	int i;
	static int si;
	
	class Inner {
		int i2;
		static int si2;
		{
			System.out.println(i);
			System.out.println(si);
		}
	}
	static class SInner{
		int i3;
		static int si3; //자기만의 멤버 
		{
			//System.out.println(i); 불가능
			System.out.println(si);
			System.out.println(Inner.si2);
			System.out.println(i3); //static {}이면 이것도 불가능함
			System.out.println(si3);
		}
	}
}
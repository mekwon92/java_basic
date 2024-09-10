package lesson07_opp.day2;

public class Circle {
	double r;
	
	public Circle() {}
	
	public Circle(double r) {
		this.r = r;
	}
	
	Circle setR(double r) {
		//this(r); 불가능... 생성자 안에서만 다른 생성자에 접근가능 setR은 메서드임!
		//setR(r);//가능...접근제한자?!
		this.r = r;
		return this;
	}
	
	
	
	Circle printRound() {
		System.out.println(Math.PI * r * 2);
		return this;
	}
	
	Circle printArea() {
		System.out.println(Math.PI * r * r);
		return this;
	}
	
	void test() {
		double r = 0;          //동명의 r일 경우
		System.out.println(r); //가까운것부터 탐색해서 위에것이 아니고 밑에거..
		System.out.println(this.r); //위의 r을 가져옴
	}
}

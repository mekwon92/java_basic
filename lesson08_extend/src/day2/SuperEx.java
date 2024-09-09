package day2;
//초기화 순서
//부모에 대한 언급은 없다만 
public class SuperEx {
	public static void main(String[] args) {
		Child child = new Child(); //Child 객체만 생성했는데 부모의 객체가 먼저 생성됨
		//child.print();
	}
}

class Parent {
	int number = 3;
	public Parent() {}//아니면 기본생성자를 만들어줘야함..?
	public Parent(int number) { //파라미터있으면 밑에도 맞춰줘야함...super(10);
		super();
		System.out.println("부모 객체 생성");
	}
}

class Child extends Parent {
	int number = 2;
	Child(){
		super(10);
		//super();  기본생성자 생략됨. 기본생성자는 모든 계층을 다 탄다.. object까지
		System.out.println("자식 객체 생성");
	}
	
	//어디에서부터 탐색을 하는거냐? scope
	void print() {
		int number = 1;
		System.out.println(number); //지역변수->클래스->조상
		System.out.println(this.number); //자기자신객체 ->없으면 조상객체
		System.out.println(super.number); // 조상객체
	}
}
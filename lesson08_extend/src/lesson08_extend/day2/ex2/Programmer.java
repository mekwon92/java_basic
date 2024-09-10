package lesson08_extend.day2.ex2;

public class Programmer extends Employee{
	public Programmer(String name) { 
		super(name);//생성자는 상속불가능
	}
	
	void work() {
		System.out.println("코딩을 합니다");
	}
}

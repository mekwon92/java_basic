package lesson08_extend;

public class Phone extends Object{ //extends Object는 항상 생략되어있는것....최고조상.
	String name;
	String color;
	String company;
	
	void call() {
		System.out.println("전화걸기");
	}
	
	void receive() {
		System.out.println("전화걸기");
	}
	
	public Phone() {}
	
	public Phone(String name, String color, String company) {
		super();
		this.name = name;
		this.color = color;
		this.company = company;
	}

	@Override //조상클래스의 기능을 재정의하는 것.. toSring은 object(최고조상)가 원래 갖고있는거니까..
	public String toString() {
		return getClass().getSimpleName() + "Phone [name=" + name + ", color=" + color + ", company=" + company + "]";
	} //이걸통해 스마트폰의 이름을쓸수잇는거임

}

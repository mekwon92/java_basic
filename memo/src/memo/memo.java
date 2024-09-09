package memo;

public class memo {

}

class Parent2 {
	String name;
	
	Parent2(String name){
		this.name = name;
	}
	Parent2(){}
	
}

class Child2 extends Parent2{
	Child2(String name){
		super(name);
	}
}

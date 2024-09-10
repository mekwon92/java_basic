package lesson09_interface;

@UserAnno(value = "hey")
public class UserClass {
	@UserAnno("hi") // value= 생략 기본이름 사용편의좋음
	void m() {
		
	}
	
	@UserAnno(value = "world", number = 10)
	void m2() {
		
	}
	
	@UserAnno({"hey", "hi", "world"}) //아무때나 붙일수있다. 
	int i;
}

package day2;
//체이닝
public class CircleMain {
	public static void main(String[] args) {
//		Circle circle = new Circle(5);
//		circle.printRound();
//		circle.printArea();
//	
		
		//계산만해보자
		new Circle()
		.setR(5).
		printArea().
		printRound().
		setR(10).
		printArea().
		printRound();
	
	}
}

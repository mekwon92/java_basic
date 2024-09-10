package diagram;
/* 원,사각형 - 둘레계산(length), 넓이계산(area)
 * 원기능, 육면체 - 넓이계산(area), 부피계산(volume)
 * 다형성으로 하나의 배열로 관리하기*/
//접근제한자, 생성자........를 준수하...자.......?
/* 원 r (둘레,넓이)
 * 사각형 width, height (둘레,넓이)
 * 원기둥 r, height
 * 육면체 가로,세로,높이
 * */
public abstract class Diagram {
	String type;
	
	Diagram(String type){
		this.type = type;
	}
	
	abstract double area();
}

class Circle extends Diagram{
	int r;
	
	Circle(int r) {
		super("원");
	}
	@Override
	double area() {
		return r * r * Math.PI;
	}
	double length() {
		return 2 * r * Math.PI;
	}
	
}

class Rectangle extends Diagram {
	int width, height;

	Rectangle(int width, int height){
		super("사각형");
	}
	@Override
	double area() {
		return width * height;
	}
	
	double length() {
		return 2 * (width + height);
	}

	
}

class CirclePoll extends Diagram{
	int r, height;
	
	CirclePoll (int r, int height){
		super("원기둥");
	}
	@Override
	double area() {
		return 2 * Math.PI * r * height + 2 * Math.PI * r * r;
	}
		
	double volume() {
		return r * r * height;
	}
	
}



class Cube extends Diagram{
	int width, height, depth;
	
	Cube (int width, int height, int depth){
		super("육면체");
	}
	@Override
	double area() {
		return 2 * (width * height + width * height + height * depth );
	}
	double volume() {
		return width * height * depth;
	}
	
} 

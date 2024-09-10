package lesson08_extend.day2;

public class ShapeEx {
	public static void main(String[] args) {//main만 public
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(5, 5);
		for(Shape s : shapes) {
			System.out.println(s);
			System.out.println("넓이 : " + s.area() + ", 둘레 : " + s.length());
		}		
	}
}

abstract class Shape {
	String type;
	
	public Shape(String type) {
		this.type = type;
	}
	abstract double area();
	abstract double length();
	
}

class Circle extends Shape {
	int r;//독자적
	Circle(int r) {
		super("원"); //원 type이 됨
		this.r = r;
	}
	@Override
	double area() {
		return r * r * Math.PI;
	}
	@Override
	double length() {
		return 2 * r * Math.PI;
	}
	@Override
	public String toString() {
		return "Circle [r=" + r + ", type=" + type + "]";
	}

	
}

class Rectangle extends Shape {
	int width, height;
	Rectangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}
	@Override
	double area() {
		return width * height;
	}
	@Override
	double length() {
		return 2 * (width + height);
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", type=" + type + "]";
	}
	
}


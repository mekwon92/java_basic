package diagram;

public class Rectangle extends Diagram {
	private int width, height;

	public Rectangle(int width, int height){
		super("사각형");
		this.width = width;
		this.height = height;
	}
	@Override
	public double area() {
		return width * height;
	}
	
	
	public double length() {
		return 2 * (width + height);
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	
	
}

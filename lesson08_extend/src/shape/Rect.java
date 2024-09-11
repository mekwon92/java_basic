package shape;

public class Rect extends Shape implements D2{
	private int x;
	private int y;
	
	public Rect(int x, int y) {
		super("사각형");
		this.x = x;
		this.y = y;	
	}

	@Override
	public double area() {
		return x * y;
	}
	@Override
	public double length() {
		return 2 * (x + y);
	}



}

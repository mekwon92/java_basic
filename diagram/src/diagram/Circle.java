package diagram;

public class Circle extends Diagram{
	private int r;
	
	public Circle(int r) {
		super("원");
		this.r = r;
	}
	@Override
	public double area() {
		return r * r * Math.PI;
	}
	

	public double length() {
		return 2 * r * Math.PI;
	}
	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}
	
	
	
}
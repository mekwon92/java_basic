package diagram;

public class Cylinder extends Diagram{
	private int r, height;
	
	public Cylinder (int r, int height){
		super("원기둥");
		this.r = r;
		this.height = height;
	}
	@Override
	public double area() {
		return 2 * Math.PI * r * height + 2 * Math.PI * r * r;
	}
		
	public double volume() {
		return r * r * height;
	}
	
	@Override
	public String toString() {
		return "Cylinder [type=" + getType() + ", r=" + r + ", height=" + height + "]";
	}
	
	
	
}


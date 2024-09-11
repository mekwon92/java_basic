package shape;

public class Cube extends Shape implements D3{
	private Rect rect;
	private int x, y, z;
	
	public Cube(int x, int y, int z) {
		super("육면체");
		this.rect = new Rect(x,y);
		this.z = z;	
	}

	@Override
	public double volume() {
		return rect.area() * z;
	}

	@Override
	public double area() {
		return 2 * (rect.area() * z * ( x + y ));
	}
	
	

}

package diagram;

public class Cube extends Diagram{

	private int width, height, depth;
	
	public Cube (int width, int height, int depth){
		super("육면체");
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	@Override
	public double area() {
		return 2 * (width * height + width * height + height * depth );
	}
	
	public double volume() {
		return width * height * depth;
	}
	@Override
	public String toString() {
		return "Cube [width=" + width + ", height=" + height +  ", depth=" + depth + "]";
	}
	
	
	
	
} 



package diagram;

public class DiagramMain  {
	public static void main(String[] args) {//main만 public
		Diagram[] diagrams = new Diagram[4];
		diagrams[0] = new Circle(10);
		diagrams[1] = new Rectangle(5, 5);
		diagrams[2] = new Cylinder(2, 4);
		diagrams[3] = new Cube(3, 4, 5);
		
		for(Diagram d : diagrams) {
			System.out.println(d);
			System.out.println("넓이 " + d.area());
			System.out.println();
		}
		
		System.out.println(diagrams[0].area());
		System.out.println(diagrams[0]);
		 
	}
}
	



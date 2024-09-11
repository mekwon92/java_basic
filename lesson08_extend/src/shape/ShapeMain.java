package shape;

public class ShapeMain {
	public static void main(String[] args) {
		Shape s1 = new Circle(10);
		System.out.println(s1.area());
		System.out.println(((D2)s1).length());
	
		Shape s2 = new Cylinder(10, 3);
		System.out.println(s2.area());
		System.out.println(((D3)s2).volume());
		
		Shape s3 = new Rect(5, 4);
		
		Shape s4 = new Cube(1, 2, 3);
		
		Shape[] shapes = new Shape[4];
		shapes[0] = s1;
		shapes[1] = s2;
		shapes[2] = s3;
		shapes[3] = s4;
		
//		for(Shape s : shapes) {
//			System.out.println(s.area());
//			if(s instanceof D2) {
//				((D2)s).length();
//			}
//			else if(s instanceof D3) {
//				((D3)s).volume();
//			}	
//		}
	}
}

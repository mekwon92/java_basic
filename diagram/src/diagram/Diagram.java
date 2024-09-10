package diagram;
/*//접근제한자, 생성자........를 준수하...자.......?
/* 원 r - 둘레, 넓이
 * 사각형 width, height - 둘레, 넓이 
 * 원기둥 r, height - 넓이, 부피
 * 육면체 width, height, depth - 넓이, 부피
 * */
public abstract class Diagram {
	private String type;
	
	public Diagram(String type){
		this.type = type;
	}
	
	public abstract double area();
}
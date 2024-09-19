package lesson13_collection;
import java.util.ArrayList;
import java.util.List;
//vector : 레거시클래스 (요즘은 잘 안씀. arraylist 사용 추천함) 멀티스레드할때나..?
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Double> vector = new Vector<>();
		// add, size, get
		
		vector.add(Math.PI);
		System.out.println(vector.size());
		System.out.println(vector.get(0));
		
		vector.addElement(Math.E);
		System.out.println(vector.elementAt(0));
		
//		vector.remove(0);
		vector.removeElement(Math.PI);
		System.out.println(vector);
	
//복제는 생성자를 이용한다
		List<Double> list = new ArrayList<Double>(vector);
		System.out.println(list);
	}
}

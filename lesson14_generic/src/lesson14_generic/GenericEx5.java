package lesson14_generic;

public class GenericEx5 {
	public static void main(String[] args) {
		Gen3 g3 = new Gen3();
		
		//하한
		Generic5<? super Gen2> g2 = new Generic5<>(g3); //g3자리에 올수있는 타입을 설정하는것 <>사이에는 생략..?..
//		Generic5<Gen2> g2 = new Generic5<>(g3); //근데 다형성때문에 g3는 원래 되는거져?
//		Gen2 t1 = g2.getT();
//		Gen3 t1 = g2.getT();
		Gen1 t2 = (Gen3)g2.getT();
		Object t1 = g2.getT();//object로 받아올수도있어요
		System.out.println(t2.genName());//사실은 gen3에요????!
		
		
		//상한
		Generic5<? extends Gen2> g4 = new Generic5<>(g3);
		Gen2 t3 = g4.getT();
		Gen3 t4 = (Gen3)g4.getT();
		
		Generic5<?> g6 = new Generic5<>(g3); //뭐든지올수있다 = object
		Object t5 = g6.getT();
		Gen3 t6 = (Gen3)g6.getT();
		
		Generic5<?> g7 = new Generic5<>(1);
		System.out.println(g7.getT());
	
		
	}
}



class Gen1 {
	String genName() {
		return getClass().getSimpleName();
	}
}

class Gen2 extends Gen1 {}
class Gen3 extends Gen2 {}


class Generic5<T>{
	T t;

	public Generic5(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

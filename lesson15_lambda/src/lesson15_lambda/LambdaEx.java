package lesson15_lambda;

import java.util.function.Function;

//고정되는거 .. 알고있는건 다빼고 ~  
//ctrl + shift + f 로 줄 정리
public class LambdaEx {
	public static void main(String[] args) {
		MyInter<Integer> inter = t -> t * t;

		System.out.println(inter.m(10));
		
		MyInter<String> inter2 = s -> "hello !! " + s;
		System.out.println(inter2.m("새똥이"));
		
		Function<String, Integer> f = s -> Integer.parseInt(s); //T은 파라미터 타임 R은 리턴타입
		
		int result = f.apply("1234");
		System.out.println(result + 1000);
		
		
		Object o = new MyInter<Integer>() {
			@Override
			public Integer m(Integer t) {
				return t;
			}
			
		};
		
//		Object o2 = s -> s; //람다식은 식 자체를 객체로 만들 수가 없음.
		Object o2 = (MyInter<String>)s -> s; //
	}
}

@FunctionalInterface // 추상메서드는 단 하나! default는 괜츈(구상메서드니까)
interface MyInter<T> {
	T m(T t);

	default T m2(T t) {
		return t;
	}
}

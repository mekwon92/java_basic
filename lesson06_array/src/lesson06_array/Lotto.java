package lesson06_array;
//로또 난수 6개 뽑기(1~45)
import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
		
		int[] lotto = new int[6]; //6자리 배열 생성 [0, 0, 0, 0, 0, 0]
		
		int idx = 0; //인덱스값은 초기화되면 안되니까 밖에...
		
		while(true) {
			int number = (int)(Math.random() * 45 + 1); //number에 랜덤으로 하나 받아옴
			
			boolean insert = true; //중복여부 변수 초기화
			
			for (int i = 0 ; i < idx ; i++) { 
				if(lotto[i] == number) { //중복값 방지 lotto의 i배열이 number와 같으면 false로 바꾸고 더이상 진행 안하겠다.
					insert = false;
					break;
				}
			}
			if(insert) {
				lotto[idx] = number; //number를 lotto[idx]에 넣고 idx는 1 추가 하겠다.
				idx++;
			}
			
			if(idx == 6) break; //횟수 제한 (탈출) 6번인덱스까지 채웠으면 더이상 진행 안함
		}
			System.out.println(Arrays.toString(lotto));
	
	
			
			
			
			
	}	
}


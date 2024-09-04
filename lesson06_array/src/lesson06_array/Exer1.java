package lesson06_array;
//모두의 마블
public class Exer1 {
	public static void main(String[] args) {
		
// 1. 모두의 마블
	// 주사위 두개를 굴려서 이동한 거리를 계산(1~6)
	// 더블일 경우 한번 더 굴린다.(둘다 같은 수) 총 이동거리를 출력
//	
	int num1 = 0;
	int num2 = 0;
	int dist = 0;
	while(num1 == num2) {
		num1 = (int)(Math.random() * 6 + 1);
		num2 = (int)(Math.random() * 6 + 1);
		System.out.println(num1+","+num2);
		
		dist += num1;
		dist += num2;
		}
	
		System.out.println(dist);
	
		
	/*for문을 이용해서 작성	
	int sum = 0;
	for(;;) {
		int dice1 = (int)(Math.random() * 6) +1;
		int dice2 = (int)(Math.random() * 6) +1;
		
		
		sum += dice1 + dice2;
		System.out.println(dice1);
		System.out.println(dice2);
		if(dice1 != dice2) {
			break;
		}
	}
	
	System.out.println(sum); */
	
	/*do while문을 이용해서 작성
	int sum = 0;
	int dice1 = 0;
	int dice2 = 0;
	do {
		dice1 = (int)(Math.random() * 6) +1;
		dice2 = (int)(Math.random() * 6) +1;
		
		
		sum += dice1 + dice2;
		System.out.println(dice1);
		System.out.println(dice2);
	}
	while(dice1 == dice2);
	System.out.println(sum);
		
	
	*/

	}
}

package lesson5_control;

public class IfEx4 {
	public static void main(String[] args) {
		//계절 계산
		int month = 5; //1~12
		
		// 3,4,5 봄 6,7,8 여름 9,10,11 가을 12,1,2 겨울
		
		if(month >= 3 && month <= 5) {
			System.out.println("봄");
		}
		else if(month >= 6 && month <= 8) {
			System.out.println("여름");
		}
		else if(month >= 9 && month <= 11) {
			System.out.println("가을");
		}
		else
			System.out.println("겨울");
	}
	

}

package lesson5_control;

public class SwitchEx {
	public static void main(String[] args) {
		int month = 5;
		//case가 여러가지인 경우
//		switch (month) {
//		case 3: case 4: case 5:
//			System.out.println("봄");
//			break;
//		case 6: case 7: case 8:
//			System.out.println("여름");
//			break;
//		case 9: case 10: case 11:
//			System.out.println("가을");
//			break;
//		default :
//			System.out.println("겨울");
//		}
		
		switch(month/3) {
	 	case 1:
			System.out.println("봄");
			break;
		case 2:
			System.out.println("여름");
			break;
		case 3:
			System.out.println("가을");
			break;
		default :
			System.out.println("겨울");
		}
		}
	}


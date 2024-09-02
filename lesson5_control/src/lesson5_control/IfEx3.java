package lesson5_control;

public class IfEx3 {
	public static void main(String[] args) {
		//자격증 시험, 과락
		//세 과목
		
		//평균이 60 이상이면 합격 
		//단, 개별과목이 40 미만이면 불합격

		int score1 = 40, score2 = 90, score3 = 50;
		int avg = (score1 + score2 + score3) / 3;
		
		
		if(avg >= 60 && score1 >= 40 && score2 >= 40 && score3 >= 40) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
//			
//		
//		if(score1 >= 40 && score2 >= 40 && score3 >= 40) {
//			if(avg >= 60) {
//				System.out.println("합격입니다");
//			}
//			else {
//				System.out.println("불합격입니다");
//			}
//				
//		}
//		else {
//			System.out.println("불합격입니다");
//		}
	}
}

package lesson5_control;
//랜덤으로 수학점수 출력& 학점 A,B,C,D,F와 + 부여하기
public class IfEx2 {
	public static void main(String[] args) { 
	
		int score = (int)(Math.random()*101);
		String grade = "";
		
		if (score >= 90) {
			grade = "A";
		}
		else if (score >= 80) {
			grade = "B";
		}
		else if (score >= 70) {
			grade = "C";
		}
		else if (score >= 60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		
		if (score % 10 >= 5) {
			grade += "+";
		}
		
		System.out.println("당신의 학점은 "+grade+"점수는 " +score + "입니다.")	;
		System.out.printf("학점은 %s, 점수는%d 입니다.", grade, score);
		
	
	
	
	}
}
		

package lesson5_control;

public class IfEx2 {
	public static void main(String[] args) {
		int score = (int)(Math.random()*101);
		String grade = "";
		System.out.println("학점부여시작");
		//A,B,C,D,F 부여
		if(score >= 90) {
			grade = "A";
		}
		else if(score >= 80) {
			grade = "B";
		}
		else if(score >= 70) {
			grade = "C";
		}
		else if(score >= 60) {
			grade = "D";
		}
		else {
			grade = "F";}
		//+ 부여
		if(score >= 60 && score % 10 >= 5 || score == 100) {
			grade += "+";
		}
		
		System.out.println("당신의 학점은" +grade+", 점수는"+score+"입니다.");
		System.out.println("학점부여 끝");
	}
	
}

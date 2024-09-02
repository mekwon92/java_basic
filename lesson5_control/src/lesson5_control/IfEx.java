package lesson5_control;

public class IfEx {
	public static void main(String[] args) {
		double rand = Math.random(); // random의 범위 : 0. ~ 0.999999999999999
		System.out.println(rand);
		//0 이상 100 이하
		int score = (int)(rand * 101);
		System.out.println("시험 시작");
		System.out.println("점수 :: " + score);
		if(score>=60) {
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격입니다");
		}
		System.out.println("시험 끝");
		System.out.println(0.999999999999999d * 101);

		
	}

}

package lesson5_control;

import java.util.Random;

//random으로 점수 출력 후 합격/불합격 출력
public class IfEx {
	public static void main(String[] args) {
		double rand = Math.random();
		int score = (int)(rand * 101);

		System.out.println(score+"점 입니다.");
		if(score >= 60) {
			System.out.println("합");
		}
		else {
			System.out.println("불합");
		}
	}

}

package lesson12_api;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		Random random = new Random(System.currentTimeMillis());
	//	Random random = new Random(0);//씨드를 넣었더니 고정값이되어벌임!
		for(int i = 0; i < 20; i++) {
		//System.out.println(random.nextInt(6)+1);
		System.out.println(random.nextInt());
		}
	}
}
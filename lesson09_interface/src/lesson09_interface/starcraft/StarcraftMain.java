package lesson09_interface.starcraft;

public class StarcraftMain {
	static String s = "abcd";
	public static void main(String[] args) {
		SCV scv = new SCV();
		Marine marine = new Marine();
		scv.repair(marine); //수리불가대상
		
		Tank tank = new Tank();
		tank.toggleSiege();
		
		scv.repair(tank);
		
		Repairable r = new Tank(); //인터페이스를 통한 다형성 덕분에 구현가능함
	//	Repairable r2 = new Marine(); //불가능
		
		Unit[] units = new Unit[12];
		
		Repairable.sm(); //static
		tank.dm(); //default
	//	marine.dm(); 불가능
		
		FInter fInter = s -> "abcd";
			
	}

}

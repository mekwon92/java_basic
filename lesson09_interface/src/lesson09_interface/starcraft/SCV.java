package lesson09_interface.starcraft;

public class SCV extends GroundUnit implements Repairable{
	//void repair(Repairable u) {}
	void repair(Unit u) {
		if(!(u instanceof Repairable)) {
			System.out.println("수리불가대상");
			return;
		}
		//수리
	}
}

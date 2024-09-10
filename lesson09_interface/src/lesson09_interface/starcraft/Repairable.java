package lesson09_interface.starcraft;

public interface Repairable {
	static void sm() {
		System.out.println("sm()");
	}
	
	default void dm() { //재정의하지않으면 
		System.out.println("dm()");
	}

}

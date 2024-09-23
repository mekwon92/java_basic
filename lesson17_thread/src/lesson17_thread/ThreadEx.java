package lesson17_thread;

public class ThreadEx {
	public static void main(String[] args) {
//		new ThreadExtend().start();
//		new Thread(new RunnableImpl(),"러너블스레드").start();
		
		Thread t1 = new ThreadExtend();
		Thread t2 = new Thread(new RunnableImpl());
		
		t2.setPriority(6);
		
		t1.start();
		t2.start();
		
		
		System.out.println("main 종료 " + Thread.currentThread().getName());
	}
}

class ThreadExtend extends Thread {
	@Override
	public void run() {
		System.out.println("thread 상속");
		for(int i = 0; i < 50; i++) {
			System.out.println("thread 상속 " +  i + currentThread().getName());
		}
	}
}

class RunnableImpl implements Runnable {
	@Override
	public void run() {
		System.out.println("runnable 구현");
		for(int i = 0; i < 50; i++) {
			System.out.println("runnable 구현 " +  i + Thread.currentThread().getName());
		}
	}
}

package lesson17_thread;
//한 객체에서 thread 쉐어
//synchronized 특정 행위나 대상에 걸어야함.
public class ThreadEx4 {
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
//		c.incre();
//		System.out.println(c.i);
		
		T t1 = new T(c);
		T t2 = new T(c);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(c.i);
	}
}

//class Counter {
//	int i;
//	synchronized void incre() {
//		for(i = 0; i < 100000 ; i++) {
//			this.i++;
//		}
//	}
//}

class Counter {
	int i;
	void incre() {
		synchronized (this) {
			for(i = 0; i < 100000 ; i++) {
				this.i++;
			}
		}
	}
}


class T extends Thread {
	Counter c;
	T(Counter c){
		this.c = c;
	}
	public void run() {
		c.incre();
	}
}
package lesson10_inner;

public class OuterEx {
	
	interface InterfaceEx {
		void method();
	}
	
	InterfaceEx ex;
	
	void setInterfaceEx(InterfaceEx ex) {
		this.ex = ex;
	}

	void outerMethod() {
		ex.method();
	}
}

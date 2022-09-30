package day11.methodoverloading;
class DemoTest100 {
	static void display() {
		System.out.println("I am display() of DemoTest100");
	}
	void call() {
		System.out.println("Calling of DemoTest100");
	}
}
public class DemoTest {

	static void display() {
		System.out.println("I am display() of DemoTest");
	}
	void call() {
		System.out.println("Calling");
	}
	public static void main(String[] args) {
		DemoTest.display();
		DemoTest d1=new DemoTest();
		d1.call();
		DemoTest100.display();
		DemoTest100 d2=new DemoTest100();
		d2.call();
		
		DemoSample.disp('A');
		DemoSample d3=new DemoSample();
		d3.callMe();
	}

}

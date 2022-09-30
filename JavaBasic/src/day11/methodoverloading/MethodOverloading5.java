package day11.methodoverloading;

public class MethodOverloading5 {
	void disp(int a, double b) {
		System.out.println("Method A");
	}

	void disp(int a, double b, double c) {
		System.out.println("Method B");
	}

	void disp(int a, float b) {
		System.out.println("Method C");
	}
	void disp(int x, int y) {
		System.out.println("Method D");
	}

	public static void main(String args[]) {
		MethodOverloading5 obj = new MethodOverloading5();
		obj.disp(100, 20);
	}
}
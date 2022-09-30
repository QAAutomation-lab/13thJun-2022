package day11.methodoverloading;

public class MethodOverloading {
	/**
	 * Method Overloading: any method declare more than once in class body with diff set of parameter like belowL
	 * anyone of below rules: 
	 * 1. type of argument differ or 
	 * 2. number of arguments/parameter should differ or 
	 * 3. position of arguments/parameter should differ
	 */
	static double res;
	static public void square() {
		System.out.println("No Parameter Method Called");
	}
	static public void square(int number) {
		res = number * number;
		System.out.println("Method with Integer Argument Called:" + res);
	}
	static public void square(double number) {
		res = number * number;
		System.out.println("Method with float Argument Called:" + res);
	}
	public static void main(String[] args) {
		System.out.println("Result: "+res);//
		MethodOverloading.square(2.5f);
		System.out.println("Result: "+res);//
		MethodOverloading.square();
		MethodOverloading.square(5);
		System.out.println("Result: "+res);//
	}
}

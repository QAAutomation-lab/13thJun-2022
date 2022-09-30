package day11.methodoverloading;

public class MethodOverloading0 {
	/**
	 * Method Overloading: any method declare more than once in class body with with diff set of parameter like below:
	 * anyone of below rules: 
	 * 1. type of argument differ or 
	 * 2. number of arguments/parameter should differ or 
	 * 3. position of arguments/parameter should differ
	 * 
	 * Note: change in method return type will not be considered as overloading
	 */
	public static void main() {
		System.out.println("I am main()...");
	}
	public static void main(String[] args) {
		main();
		System.out.println("sum:1 "+addNumbers());
		System.out.println("sum:2 "+MethodOverloading0.addNumbers(45, 55));
		System.out.println("sum:3 "+addNumbers(47, 53,58));
		System.out.println("sum:4 "+MethodOverloading0.addNumbers(47, 53.56,58));
	}
	static int addNumbers() {
		System.out.println("********* addNumbers() started *********");
		int num1=10,num2=20;
		System.out.println("********* addNumbers() before return *********");
		return num1+num2;		
	}
	static double addNumbers(int num1,int num2) {
		System.out.println("********* addNumbers(int,int) started *********");		
		System.out.println("********* addNumbers(int,int) before return *********");
		return num1+num2;		
	}
	static int addNumbers(int num1,int num2,int num3) {
		System.out.println("********* addNumbers(int,int,int) started *********");		
		System.out.println("********* addNumbers(int,int,int) before return *********");
		return num1+num2;		
	}
	static double addNumbers(int num1,double num2,int num3) {
		System.out.println("********* addNumbers(int,double,int) started *********");		
		System.out.println("********* addNumbers(int,double,int) before return *********");
		return num1+num2;		
	}
	static double addNumbers(double num1,int num2,int num3) {
		System.out.println("********* addNumbers(double,int,int) started *********");		
		System.out.println("********* addNumbers(double,int,int) before return *********");
		return num1+num2;		
	}
}

package day11.methodoverloading;

class Adder {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	static void call() {
		System.out.println("I am call() of Adder class");
	}
}
public class MethodOverloading3 {
	static void call() {
		System.out.println("I am call() of MethodOverloading3 class");
	}
	public static void main(String[] args) {
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(11, 11, 11));
		Adder.call();
		//call();
		//or
		MethodOverloading3.call();
	}
}

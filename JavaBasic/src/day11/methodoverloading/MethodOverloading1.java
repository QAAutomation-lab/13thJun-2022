package day11.methodoverloading;

public class MethodOverloading1 {
	public static void main(String[] args) {
		MethodOverloading1 m1=new MethodOverloading1();
		System.out.println("Sum1: "+m1.addNumbers());
		System.out.println("Sum2: "+m1.addNumbers(25,55));
		System.out.println("Sum3: "+m1.addNumbers(25,55,88));
		System.out.println("Sum4: "+m1.addNumbers(25,55.56,88));
		m1.display();
		System.out.println("Sum5: "+m1.addNumbers(25.5,55.88));
	}
	void display() {
		System.out.println("I am Pune");
	}
	int addNumbers() {
		System.out.println("********* addNumbers() started *********");
		int num1=10,num2=20;
		System.out.println("********* addNumbers() before return *********");
		return num1+num2;		
	}
	int addNumbers(int num1,int num2) {
		System.out.println("********* addNumbers(int,int) started *********");		
		System.out.println("********* addNumbers(int,int) before return *********");
		return num1+num2;		
	}
	double addNumbers(double num1,double num2) {
		System.out.println("********* addNumbers(double,double) started *********");		
		System.out.println("********* addNumbers(double,double) before return *********");
		return num1+num2;		
	}
	int addNumbers(int num1,int num2,int num3) {
		System.out.println("********* addNumbers(int,int,int) started *********");		
		System.out.println("********* addNumbers(int,int,int) before return *********");
		return num1+num2+num3;		
	}
	double addNumbers(int num1,double num2,int num3) {
		System.out.println("********* addNumbers(int,double,int) started *********");		
		System.out.println("********* addNumbers(int,double,int) before return *********");
		return num1+num2;		
	}
}

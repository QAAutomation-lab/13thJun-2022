package day10.methods;

public class Method3 {
	/*
	 * accessmodifier:
	 * non-accessmodifier:
	 * return type:
	 * methodName:
	 * argument/parameter: 
	 * return value:
	 */
	public static void printDetails(int age, int salary) {//int age=25; int salary=56000;
		System.out.println("Hi, Good morning Everyone");
		System.out.println("Staying in Pune");
		System.out.println("I am "+age+" yrs old");
		System.out.println("My Salary is "+salary);
		//return;//optional because if you don't write it dn java compiler will write it
	}
	public static void main(String[] args) {
		
//		System.out.println("Hi, Good morning Everyone");
//		System.out.println("Staying in Pune");
//		System.out.println("I am 25 yrs old");
//		System.out.println("My Salary is 45500");
//		System.out.println("Hi, Good morning Everyone");
//		System.out.println("Staying in Pune");
//		System.out.println("I am 30 yrs old");
//		System.out.println("My Salary is 56000");
		System.out.println("************1***************");
		printDetails(30, 96000);
		System.out.println("************2***************");
		Method3.printDetails(25, 56000);
		System.out.println("************3***************");
		printDetails(26, 45000);
		System.out.println("************4***************");
		printDetails(24, 25000);
		System.out.println("************5***************");
		printDetails(29, 75000);
		System.out.println("************6***************");
		Method3.printDetails(28, 65000);
		System.out.println("************7***************");
		printDetails(32, 85000);
		System.out.println("************8***************");
		printDetails(31, 35000);
		System.out.println("*************9**************");
		Method3.printDetails(36, 55000);
		System.out.println("************10***************");
		printDetails(23, 45202);
	}	
}

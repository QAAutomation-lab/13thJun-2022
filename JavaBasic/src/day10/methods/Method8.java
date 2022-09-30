package day10.methods;

public class Method8 {
	int getNumber() {
		return 25;
	}
	void display(){
		System.out.println("**********display() without param started*****************");
		char grade='A';
		int age=30, salary=45000;
		System.out.println("Grade is: "+grade);
		System.out.println("Age is: "+age);
		System.out.println("Salary is: "+salary);
		System.out.println("**********display() without param ends*****************");
	}
	void display(char grade,int age,int salary){
		System.out.println("**********display(char,int,int) with param started*****************");
		System.out.println("Grade is: "+grade);//A
		System.out.println("Age is: "+age);//25
		System.out.println("Salary is: "+salary);//45000
		System.out.println("**********display(char,int,int) with param ends*****************");
	}
	void display(int age,char grade,int salary){
		System.out.println("**********display(int,char,int) with param started*****************");
		System.out.println("Age-Grade-Salary is: "+age+"-"+grade+"-"+salary);//30-B-45000
		System.out.println("**********display(int,char,int) with param ends*****************");
	}
	void display(int age){
		System.out.println("**********display() with int param started*****************");
		System.out.println("Age is: "+age);
		System.out.println("**********display() with int param ends*****************");
	}
	void display(char grade){
		System.out.println("**********display() with char param started*****************");
		System.out.println("Grade is: "+grade);
		System.out.println("**********display() with char param ends*****************");
	}
	/**
	 * Method Overloading: when a method declared more dn once in class with different set of argument like:
	 * 1. type of argument differ //or
	 * 2. number of argument differ  //or
	 * 3. position of argument differ
	 */
	public static void main(String[] args) {
		System.out.println("Program Starts...");
		Method8 m1=new Method8();
		m1.display();
		m1.display('B',29,55000);
		m1.display('A',32,45000);
		m1.display('C',23,25000);
		m1.display(29,'A',25000);
		m1.getNumber();
		System.out.println("Program ends...");
	}
	
	
}

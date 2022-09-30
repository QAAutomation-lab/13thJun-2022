package day13Constructor;

public class Cons0 {

	int age=10;
//	Cons0(){
//		//default constructor written by java compiler at the time of compilation
//	}
	public static void main(String[] args) {
		
		System.out.println("Program Starts..");
		Cons0 c1=new Cons0();
		System.out.println(c1.age);
		System.out.println("Program Ends..");
	}
}

/**
constuctor is used to initilize instance members of the class, Contructor is similar to method but,
	1. constuctor name should be same as classname
	2. constuctor doesn't have return type and also not returns any value
	3. constuctor gets called automatically when an instance/object of a class is created
	4. being a programmer we can't call/executed constuctor based on our requirement
	5. constuctor are 2 types
		a. default constuctor : written by java compiler with empty body
		b. user defined constuctor : written by programmer
			i. zero parameterized constuctor
			ii. parameterized constuctor		
*/
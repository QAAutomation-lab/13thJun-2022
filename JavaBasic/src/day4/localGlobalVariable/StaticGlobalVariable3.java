package day4.localGlobalVariable;

public class StaticGlobalVariable3 {
	//systax to declare variable: datatype variablename;
	//static global variable
	static int empId;//default value
	static double salary;//default value
	static char grade;//default value
	static boolean isPrime;//default value
	public static void main(String[] args) {
		System.out.println("Program Starts....");
		System.out.println("EmpId: "+empId);//
		System.out.println("Salary: "+salary);//
		System.out.println("Grade: "+grade);// 
		System.out.println("Prime: "+isPrime);//
		int age=25;//local variable: mandatory to initialize before we use them
		System.out.println(age);
		System.out.println("Program Ends...");
	}
}

/**
 * SGV are known as class variable
 * They are loaded in the memory at the time compilation when the class is getting created
 * As they are class variable, hence in order to access them we can use "classname.staticvariablename" name
 * or we can also access SGV directly from another static method
 * Static members will be have single memory allocation
 */

package day4.localGlobalVariable;

public class StaticGlobalVariable2 {

	static int age=25;
	public static void main(String[] args) {
		System.out.println("Program Starts....");
		System.out.println("SGV : "+age);//25
		System.out.println("SGV with standard: "+StaticGlobalVariable2.age);//25
		System.out.println("**********************************");
		age=30;	
		System.out.println("SGV : "+age);//30
		System.out.println("SGV with standard: "+StaticGlobalVariable2.age);//30
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

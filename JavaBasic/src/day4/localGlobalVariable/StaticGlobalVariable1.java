package day4.localGlobalVariable;

public class StaticGlobalVariable1 {

	static int mobileNumber=123;//static global variable
	public static void main(String[] args) {
		System.out.println("Program Starts....");
		System.out.println("SGV : "+mobileNumber);//123
		System.out.println("SGV with standard: "+StaticGlobalVariable1.mobileNumber);//123
		System.out.println("**********************************");
		mobileNumber=456;	//re-initialization or updating or overriding the value of age variable
		System.out.println("SGV : "+mobileNumber);//456
		System.out.println("SGV with standard: "+StaticGlobalVariable1.mobileNumber);//456
		System.out.println("***********************************");
		int mobileNumber=789;//local variable
		System.out.println("Local Variable : "+mobileNumber);//
		System.out.println("SGV with standard: "+StaticGlobalVariable1.mobileNumber);//456
		System.out.println("Program Ends...");
	}
}

/**
 * SGV always declares with static keyword
 * SGV are known as class variable
 * They are loaded in the memory at the time compilation when the class is getting created
 * As they are class variable, hence in order to access them we can use "classname.staticvariablename" name
 * or we can also access SGV directly from another static method
 * Static members will have single memory allocation
 */

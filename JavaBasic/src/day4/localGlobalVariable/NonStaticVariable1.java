package day4.localGlobalVariable;
public class NonStaticVariable1 {
	//Global Variable
	int mobileNum=123;//non-static Global Variable
	public static void main(String[] args) {
		System.out.println("Program Starts...");
		//Creating instance/object of a class
//		NonStaticVariable1 ref;//no object created at this line, its just a like a variable name
//		ref= new NonStaticVariable1();//object created
				//or
		NonStaticVariable1 ref = new NonStaticVariable1();
		System.out.println("1st ref, NonStatic Global variable: "+ref.mobileNum);//123
		ref.mobileNum=456;
		System.out.println("1st ref, Updated NonStatic Global variable: "+ref.mobileNum);//456
		//2nd instance/object creation
		NonStaticVariable1 ref1 = new NonStaticVariable1();
		System.out.println("2nd ref, NonStatic Global variable: "+ref1.mobileNum);//123
		System.out.println("Program Ends...");
	}
}
/**
 * NSGV never use static keyword while declaration
 * NSGV are known as instance/object variable
 * They are loaded in the memory at the time Execution time when the class instance/object is getting created
 * As they are instance/object variable, hence in order to access them we can create an instance/object of a class
 * 			className refVariable =  new className();--->copy of nonstatic member will be loaded into memory
 * to access non-static member: refVariable.nonstaticvariablename
 * or we can also access NSGV directly from another non-static method
 * NonStatic members will have multiple memory allocation
 */
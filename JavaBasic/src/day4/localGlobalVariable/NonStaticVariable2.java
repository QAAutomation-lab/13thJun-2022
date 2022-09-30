package day4.localGlobalVariable;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class NonStaticVariable2 {
	//Global Variable
	int mobileNum=123;//non-static Global Variable
	char grade;//non-static Global Variable
	public static void main(String[] args) {
		System.out.println("Program Starts...");
		//create an object
		System.out.println("*************r1 Object****************");
		NonStaticVariable2 r1=new NonStaticVariable2();
		System.out.println("mobilenum with r1 reference: "+r1.mobileNum);//
		System.out.println("grade with r1 reference: "+r1.grade);// 
		System.out.println("*************x1 Object****************");
		NonStaticVariable2 x1=new NonStaticVariable2();
		System.out.println("mobilenum with x1 reference: "+x1.mobileNum);//
		System.out.println("grade with x1 reference: "+x1.grade);// 
		System.out.println("*************updated x1 Object variables****************");
		x1.mobileNum=987;
		x1.grade='A';
		System.out.println("updated, mobilenum with x1 reference: "+x1.mobileNum);//
		System.out.println("updated, grade with x1 reference: "+x1.grade);// 
		System.out.println("*************r1 Object****************");
		System.out.println("mobilenum with r1 reference: "+r1.mobileNum);//
		System.out.println("grade with r1 reference: "+r1.grade);// 
		System.out.println("Program Ends...");
	}
}
/**
 * NSGV are known as instance/object variable
 * They are loaded in the memory at the time Execution time when the class instance/object is getting created
 * As they are instance/object variable, hence in order to access them we can create an instance/object of a class
 * 			className refVariable =  new className();
 * to access non-static member: refVariable.nonstaticvariablename
 * or we can also access NSGV directly from another non-static method
 * NonStatic members will have multiple memory allocation
 */
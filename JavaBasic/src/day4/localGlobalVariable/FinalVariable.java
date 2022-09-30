package day4.localGlobalVariable;

public class FinalVariable {

	public static void main(String[] args) {
		
		final int empId=856;
		System.out.println("EmpId: "+empId);//
		//empId=456;//error at compile time as final variable value can't be changed
		System.out.println("EmpId: "+empId);//
		//empId=789;//error at compile time as final variable value can't be changed
		System.out.println("EmpId: "+empId);//
		//empId=654;//error at compile time as final variable value can't be changed
		System.out.println("EmpId: "+empId);//
	}
}
/*
final: is keyword
	: constant or fixed value
	: variable should be declared final at the declaration time
	: once its value is initiliazed dn that value can not be changed
	: final global variable needs to be initiliaze at the time of declaration only
*/
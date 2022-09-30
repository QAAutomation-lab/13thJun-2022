package day10.methods;

public class Method1 {

	/*
	 * accessmodifier:
	 * non-accessmodifier:
	 * return type:
	 * methodName:
	 * argument/parameter:
	 * return value:
	 */
	private static int getEmpName(int id) {
		//statements
		return id;
	}
	/*
	 * accessmodifier:
	 * non-accessmodifier:
	 * return type:
	 * methodName:
	 * argument/parameter:
	 * return value:
	 */
	public static int getEmpContact(short id) {
		//statements
		return id;
	}
	/*
	 * accessmodifier:
	 * non-accessmodifier:
	 * return type:
	 * methodName:
	 * argument/parameter:
	 * return value:
	 */
	static protected double getEmpPin(long id) {
		//statements
		return id;
	}
	/*
	 * accessmodifier:
	 * non-accessmodifier:
	 * return type:
	 * methodName:
	 * argument/parameter: 
	 * return value:
	 */
	static int getEmpAccount() {
		//statement
		return 25;
	}
	/*
	 * accessmodifier:
	 * non-accessmodifier:
	 * return type:
	 * methodName:
	 * argument/parameter: 
	 * return value:
	 */
	public static void main(String[] args) {
		
		//return;//by default written by java compiler at the time of compilation
	}
	/*
	 * accessmodifier:
	 * non-accessmodifier:
	 * return type:
	 * methodName:
	 * argument/parameter: 
	 * return value:
	 */
	void addTwoNumbers() {
		int num1=25,num2=50,res;
		res=num1+num2;
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		System.out.println("Res: "+res);
	}
	/*
	 * accessmodifier:
	 * non-accessmodifier:
	 * return type:
	 * methodName:
	 * argument/parameter: 
	 * return value:
	 */
	private double addTwoNumbers(int num1,int num2) {
		int res;
		res=num1+num2;
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		System.out.println("Res: "+res);
		return res;
	}
}

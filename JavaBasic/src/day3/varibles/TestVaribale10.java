package day3.varibles;

public class TestVaribale10 {

	public static void main(String[] args) {
		int num1=20,num2=30,result;
		result = num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Addition Result: "+result);//50
		System.out.println("**********************************");
		//reassigning result value
		result=num1*num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Multipication Result: "+result);//600
		System.out.println("**********************************");
		//reassigning result value
		double divRes =num1/num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Division Result: "+divRes);//0.0
		System.out.println("**********************************");
		//reassigning result value
		divRes =num1/30.0;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Division Result: "+divRes);//0.6666666666666666
	}
}

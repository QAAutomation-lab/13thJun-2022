package day3.varibles;

class TestVaribale2 {

	public static void main(String[] args) {
		//declare a variable :--> datatype variableName;
		// variableName = value; 
		//datatype variableName = value;
		
		int age;//datatype: int , identifier: age
		age=25; //identifier: age, literal: 25
		System.out.println("age");//age
		System.out.println(age);//25
				//or
		System.out.println("age "+age);//Concatenation
		/*
		 * Addition: 
		 * num1+num2=num3
		 * 20+10=30
		 * Concatenation:
		 * "Sample"+10=Sample10
		 * "Sample"+10+20=>"Sample10"+20=>Sample1020
		 * "Sample"+10+20+30=>"Sample10"+20+30=>"Sample1020"+30=>Sample102030
		 * "Sample"+(10+20+30)=>Sample+60=>Sample60
		 * 10+20+"Sample"=>30+"Sample"=>30Sample
		 * 20+"Sample"=>20Sample
		 */
		System.out.println(age);
		System.out.println(25);
		System.out.println('A');
		char c1='A';
		System.out.println(c1);
		System.out.println(2536.256f);
		System.out.println(465.66676757);
		System.out.println(true);		
	}

}

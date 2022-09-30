package day3.varibles;

public class TestVaribale9 {

	public static void main(String[] args) {

		//22/7*10*10 ===>3.14*10*10
		int r=10;
		double res;
		res=(22/7)*r*r;//3*10*10==>300.0
		System.out.println("Result1: "+res);//0.0,314,NOA,300
		res=3.14*r*r;
		System.out.println("Result2: "+res);//314,314.0
		
		double res2=65/4;//===>
		System.out.println("Result3: "+res2);//16.0,16.25,16.00,16,16.250
		res2=65/4.0f;//===>
		System.out.println("Result4: "+res2);//16.25
	}

}

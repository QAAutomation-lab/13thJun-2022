package day17This;

public class ThisStatement0 {

	ThisStatement0()
	{
		System.out.println("******Zero-Param*********");
	}
	ThisStatement0(int age)
	{
		System.out.println("******int-Param*********");
	}
	ThisStatement0(char c, double d)
	{
		System.out.println("******char-double-Param*********");
	}
	public static void main(String[] args) {
		
		ThisStatement0 t1=new ThisStatement0();
		ThisStatement0 t2=new ThisStatement0(25);
		ThisStatement0 t3=new ThisStatement0('c',25.36);
	}
}

/**
 * this()--> 
 * 			this statement is an instance of current class which is declared inside the constructor body 
 * 			its should be first statement inside the constructor body
 * 			its used to call another constructor of the same class based on parameter. 
 */

package day17This;

public class ThisStatement01 {

	ThisStatement01()
	{
		System.out.println("******Zero-Param*********");
	}
	ThisStatement01(int age)
	{
		this();
		System.out.println("******int-Param*********");
	}
	ThisStatement01(char c, double d)
	{
		this(25);
		System.out.println("******char-double-Param*********");
	}
	public static void main(String[] args) {
		ThisStatement01 t3=new ThisStatement01('c',25.36);
	}
}

/**
 * this()--> 
 * 			this statement is an instance of current class which is declared inside ths constuctor body 
 * 			its should be first statement inside the constructor body
 * 			its used to call another constructor of the same class based on parameter. 
 * 
 */

package day17This;

public class ThisStatement001 {

	ThisStatement001()
	{
		this('c',25.36);
		System.out.println("******Zero-Param*********");
	}
	ThisStatement001(int age)
	{
		System.out.println("******int-Param*********");
	}
	ThisStatement001(char c, double d)
	{
		this(25);
		System.out.println("******char-double-param*********");
	}
	public static void main(String[] args) {
		
		ThisStatement001 t1=new ThisStatement001();
	}
}

/**
 * this()--> 
 * 			this statement is an instance of current class which is declared inside ths constuctor body 
 * 			its should be first statement inside the constructor body
 * 			its used to call another constructor of the same class based on parameter. 
 * 
 */

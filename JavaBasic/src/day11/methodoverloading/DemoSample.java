package day11.methodoverloading;

public class DemoSample {

	 	public void disp(char c)
	    {
	         System.out.println("I am disp() of DemoSample class "+c);
	    }
	    public void disp(char c, int num)  
	    {
	         System.out.println(c + " "+num);
	    }
	    
	    public void callMe() {
	    	System.out.println("I am callMe() of DisplayOverloading class");
	    }

}
/**
 * Method Overloading: when a method declared more dn once in class with different set of argument known as method overloading
 * like:
 * 1. type of argument differ //or
 * 2. number of argument differ  //or
 * 3. position of argument differ
 */
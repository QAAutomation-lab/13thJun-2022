package day4.localGlobalVariable;

public class FinalVariable4 {
	/* as pi is a global variable*/
	final static double pi=3.14;
	public static void main(String[] args) {
		//area=pi*r*r;
		int r=25;
		System.out.println("Radius is: "+r);
		double area = pi*r*r;
		System.out.println("area of circle is: "+area);
	}
}
/*
final: is keyword
	: constant or fixed
	: once its value is initiliazed dn that value can not be changed
	: final variable needs to be initiliaze at the time of declaration
*/
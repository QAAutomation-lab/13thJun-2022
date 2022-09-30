package day4.localGlobalVariable;

public class FinalVariable2 {

	public static void main(String[] args) {
		
		//area=pi*r*r;
		int r=25;
		final double pi;// as pi is a local variable hence its value can be initiliaze before use as well
		System.out.println("Radius is: "+r);
		pi=3.14;
		double area = pi*r*r;
		System.out.println("area of circle is: "+area);
	}
}
/*
final: is keyword
	: constant or fixed
	: once its value is initiliazed that value can not be changed
	: final variable needs to be initiliaze at the time of declaration
*/
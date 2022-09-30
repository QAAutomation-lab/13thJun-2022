package day4.localGlobalVariable;

public class FinalVariable5 {
	/* as pi is a global variable hence its value needs to be initiliaze at the time of declaration only*/
	static final double pi;//pi=0.0;
	public static void main(String[] args) {
		//area=pi*r*r;
		int r=25;
		pi=3.14;//compile time error as by default pi value is 0.0 based on datatype and also declared as final, so its value can't be changed
		System.out.println("Radius is: "+r);
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
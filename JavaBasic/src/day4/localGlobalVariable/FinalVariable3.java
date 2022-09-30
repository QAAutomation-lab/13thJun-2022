package day4.localGlobalVariable;

public class FinalVariable3 {

	public static void main(String[] args) {
		
		//area=pi*r*r;
		int r=25;
		final double pi =3.14;
		double area = pi*r*r;
		System.out.println("Radius is: "+r+"\narea of circle is: "+area);
	}
}
/*
final: is keyword
	: constant or fixed
	: once its value is initiliazed that value can not be changed
	: final variable needs to be initiliaze at the time of declaration
*/
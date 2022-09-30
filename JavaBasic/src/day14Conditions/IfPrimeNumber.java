package day14Conditions;

public class IfPrimeNumber {

	public static void main(String[] args) {
		/*
		 * num==2, num%num=0,num!=0,num!=1
		 */
		int num=3;
		if(num==0 || num==1) {
			System.out.println("not a prime number : "+num);
		}else if(num%num==0 ) {
			System.out.println("Number is prime: "+num);
		}else {
			System.out.println();
		}
	}
	

}

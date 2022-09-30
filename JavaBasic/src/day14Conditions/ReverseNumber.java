package day14Conditions;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123,rev=0,rem=0;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse Number: "+rev);
		System.out.println("Reverse Number using method: "+getReverseNumber(12345));
	}
	public static int getReverseNumber(int num) {
		/**
		 * rem=num%10
		 * rev=rem+rev*20
		 * num=num/10
		 */
		int rev=0,rem;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;		
	}
}

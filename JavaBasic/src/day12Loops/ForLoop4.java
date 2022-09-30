package day12Loops;

public class ForLoop4 {
	public static void main(String args[]) {

		/*
		 * for(initialization;condition;incr/decr){  
		 * //statement or code to be executed   }  
		 */

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			i = i + 1;
		}
		System.out.println("****************Even Number*****************");
		for (int i = 1; i < 50; i++) {
			if ((i % 2 == 0)) {
				System.out.println(i);
			}
		}
		System.out.println("****************Odd Number*****************");
		for (int i = 50; i > 0; i--) {
			if (!(i % 2 == 0)) {
				System.out.println(i);
			}
		}
//		System.out.println("************Infinite loop**************");
//		for (int i = 0; i >= 0; i++) {
//			if ((i % 2 == 0)) {
//				System.out.println(i);
//			}
//		}
		System.out.println("*************Nested for loop-half pyramid****************");
		for(int i=0;i<5;i++) {//no of line in pyramid
			for(int j=0;j<=i;j++) {
				System.out.print("* ");//format to be printed
			}
			System.out.println();
		}
		System.out.println("*************Nested for loop-half invert pyramid****************");
		for(int i=0;i<5;i++) {//no of line in pyramid
			for(int j=5;j>i;j--) {
				System.out.print("* ");//format to be printed
			}
			System.out.println();
		}
		
		System.out.println("********************Ascii Value************************");
		for (char c1 = 'a'; c1 <='z'; c1++) {
			int asciiValue=c1;
			System.out.println(c1+": "+asciiValue);
		}
	}
}

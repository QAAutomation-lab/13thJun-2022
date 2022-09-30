package day14Conditions;

public class PrimeNumber {

	public static void main(String[] args) {
//		System.out.println("Prime numbers from 1 to 100 are :");
//		int primeCt = 0;
//		for (int i = 1; i <= 100; i++) {
//			int counter = 0;
//			for (int num = i; num >= 1; num--) {
//				if (i % num == 0) {
//					counter = ++counter;
//				}
//			}
//			if (counter == 2) {
//				System.out.println("Prime Number: " + i);
//				primeCt++;
//			}
//		}
//		System.out.println("Total Prime number count: " + primeCt);
		System.out.println("check give number is prime or not: "+checkPrimeNumber(1));
		checkPrimeNumberTillPassedNumber(10);
	}

	static boolean checkPrimeNumber(int num) {
		int counter = 0;
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					counter = ++counter;
				}
			}
			if (counter == 2) {
				System.out.println("Prime Number: " + num);
				return true;
			} else {
				System.out.println("Number is not a prime: " + num);
				return false;
			}
		} else {
			System.out.println("Number is not a prime: " + num);
			return false;
		}
	}

	static void checkPrimeNumberTillPassedNumber(int num) {
		if (!(num == 0 || num == 1)) {
			for (int i = 2; i < num; i++) {
				int counter = 0;
				for (int j = i; j >= 1; j--) {
					if (i % j == 0) {
						counter = ++counter;
					}
				}
				if (counter == 2) {
					System.out.println("Prime Number: " + i);
				}
			}
		}
	}

}

/**
 * next line : F6 inside function or method: F5 value of variable: ctrl+shft+i
 * continue : F8
 */

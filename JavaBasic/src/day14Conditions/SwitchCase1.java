package day14Conditions;

public class SwitchCase1 {

	public static void main(String args[]) {
		int value = 8;
		switch (value) {
		case 1:
			System.out.println("Hi, Today is monday..");
			break;
		case 2:
			System.out.println("Hi, Today is tuesday..");
			break;
		case 3:
			System.out.println("Hi, Today is wednesday..");
			break;
		case 4:
			System.out.println("Hi, Today is thursday..");
			break;
		case 5:
			System.out.println("Hi, Today is friday..");
			break;
		case 6:
			System.out.println("Hi, Today is saturday..");
			break;
		case 7:
			System.out.println("Hi, Today is sunday..");
			break;
		default:
			System.out.println("Sorry none of your cases matched");
			break;
		}
	}

}

package day14Conditions;

public class SwitchCase4 {

	public static void main(String args[]) {
		int num1 = 10, num2 = 5, res;
		char op = '%';

		switch (op) {

		case '-':
			res = num1 - num2;
			System.out.println("num1-num2=" + res);
			break;
		case '+':
			res = num1 + num2;
			System.out.println("num1+num2=" + res);
			break;
		case '/':
			res = num1 / num2;
			System.out.println("num1/num2=" + res);
			break;
		default:
			System.out.println("Unknown operation");
			break;
		}
		System.out.println("ends here...");
	}

	static double cal(char op, int num1, int num2) {
		int res=0;
		switch (op) {
		case '-':
			res = num1 - num2;
			System.out.println("num1-num2=" + res);
			return res;
		case '+':
			res = num1 + num2;
			System.out.println("num1+num2=" + res);
			return res;
		case '/':
			res = num1 / num2;
			System.out.println("num1/num2=" + res);
			return res;
		default:
			System.out.println("Unknown operation");
			return res;
		}
	}

}

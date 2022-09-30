package day14Conditions;

import java.awt.Checkbox;

public class SwitchCase3 {

	public static void main(String args[]) {
		char ch = 'b';
		switch (ch) {
		case 'e':
			System.out.println("Value matched - e, a vowel");
			break;
		case 'a':
			System.out.println("Value matched - a, a vowel");
			break;
		case 'w':
			System.out.println("Value matched - w, not a vowel");
			break;
		case 'o':
			System.out.println("Value matched - o, a vowel");
			break;
		case 'i':
			System.out.println("Value matched - i, a vowel");
			break;
		default:
			System.out.println("Given character is not a vowel");
			break;
		}
		//checkVowels('a');
		//System.out.println("vowels ct: "+checkVowelsCt('a', 'z'));
		System.out.println("cons ct: "+checkConsCt('a', 'z'));
	}
	public static int checkVowelsCt(char start,char ends) {
		int ct=0;
		for(char c1=start;c1<=ends;c1++) {
			if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u') {
				ct=ct+1;
			}
		}
		return ct;
	}
	
	public static int checkConsCt(char start,char ends) {
		int ct=0;
		for(char c1=start;c1<=ends;c1++) {
			if(!(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')) {
				ct=ct+1;
			}
		}
		return ct;
	}
	public static void checkVowels(char ch) {
		switch (ch) {
		case 'e':
			System.out.println("Value matched - e, a vowel");
			break;
		case 'a':
			System.out.println("Value matched - a, a vowel");
			break;
		case 'w':
			System.out.println("Value matched - w, not a vowel");
			break;
		case 'o':
			System.out.println("Value matched - o, a vowel");
			break;
		case 'i':
			System.out.println("Value matched - i, a vowel");
			break;
		default:
			System.out.println("Given character is not a vowel");
			break;
		}
	}

}

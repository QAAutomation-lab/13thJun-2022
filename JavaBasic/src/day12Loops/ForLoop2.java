package day12Loops;

public class ForLoop2 {
	public static void main(String args[]) {
		System.out.println("**************Vowels between a to z*********");
		for (char c1 = 'a'; c1 <= 'z'; c1++) {
			if ((c1 == 'a') || (c1 == 'e') || (c1 == 'i') || (c1 == 'o') || (c1 == 'u')) {
				System.out.println("Vowel is : " + c1);
			}
		}
		
		System.out.println("**************Vowels count between a to p*********");
		int counter=0;
		for (char c1 = 'a'; c1 <= 'p'; c1++) {
			if ((c1 == 'a') || (c1 == 'e') || (c1 == 'i') || (c1 == 'o') || (c1 == 'u')) {
				System.out.println("Vowel is : " + c1);
				++counter;//counter=counter+1;//counter +=counter;
			}
		}
		System.out.println("Vowels count between a to p: "+counter);
		System.out.println("**************Consonent count between a to z*********");
		counter=0;
		for (char c1 = 'a'; c1 <= 'z'; c1++) {
			if (!((c1 == 'a') || (c1 == 'e') || (c1 == 'i') || (c1 == 'o') || (c1 == 'u'))) {
				System.out.println("Consonent is : " + c1);
				++counter;//counter=counter+1;//counter +=counter;
			}
		}
		System.out.println("Consonent count between a to z: "+counter);
		
		printConsonents('c', 'n');
	}
	static void printConsonents(char starts,char ends) {
		int counter=0;
		char c1=starts;
		for ( ; c1 <= ends; c1++) {
			if (!((c1 == 'a') || (c1 == 'e') || (c1 == 'i') || (c1 == 'o') || (c1 == 'u'))) {
				System.out.println("Consonent is : " + c1);
				++counter;//counter=counter+1;//counter +=counter;
			}
		}
		System.out.println("Consonent count between "+starts+" to "+ends+": "+counter);
	}
}

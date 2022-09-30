package day19Blocks;

public class TestSample {

	int age = 25;
	double salary = 15000.57;

	void print() {
		System.out.println("age: " + age);
		System.out.println("salary: " + salary);
	}
	public static void main(String[] args) {
		System.out.println("main() Starts..");
		TestSample b1 = new TestSample();
		b1.print();//
		b1.salary=45000.32;
		b1.print();//
		System.out.println("main() ends..");
	}
}

package day4.localGlobalVariable;

public class Variables {
	//global variable
	double salary;
	static char grade;
	int age=28;
	static int empId=123;
	public static void main(String[] args) {
		System.out.println("Program Starts...");
		int empId=456;
		System.out.println("local empId with std: "+empId);//
		System.out.println("SGV grade with std: "+Variables.grade);//
		System.out.println("SGV grade without std: "+grade);//
		System.out.println("SGV empId with std: "+Variables.empId);//
		
		Variables v1=new Variables();
		System.out.println("NSGV salary with std: "+v1.salary);
		System.out.println("NSGV age with std: "+v1.age);
	
		Variables v2=new Variables();
		v2.salary=25000;
		v2.age=30;
		System.out.println("NSGV salary with std: "+v2.salary);
		System.out.println("NSGV age with std: "+v2.age);
		System.out.println("Program Ends...");
	}
}

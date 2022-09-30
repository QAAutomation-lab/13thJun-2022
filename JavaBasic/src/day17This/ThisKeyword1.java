package day17This;
class Student {
	int rollno;
	float fee;
	Student(int rollno, float fee) {//int rollon=101; float fee=5000.0f;
		System.out.println("Local rollno: "+rollno);
		System.out.println("Local fee: "+fee);
		rollno = rollno;
		fee = fee;
		System.out.println("Local rollno: "+rollno);
		System.out.println("Local fee: "+fee);
	}
	void display() {
		System.out.println(rollno + " " +  fee);
	}
}
class ThisKeyword1 {
	static int rollNum,res;;
	public static void main(String args[]) {
		Student s1 = new Student(101, 5000f);
		s1.display();//0 0.0
		Student s2 = new Student(102, 6000f);
		s2.display();//0 0.0
		int rollNum=65;
		System.out.println("access Local rollNum: "+rollNum);
		System.out.println("access global roolNum: "+ThisKeyword1.rollNum);
		System.out.println("access global res: "+res);
		System.out.println("access global res: "+ThisKeyword1.res);
	}
}
/**
 * this keyword:
 * 	- Its an instance of current class
 *  - its use to diffirenticate non-static global and local variable when they have same name
 *  - can be use to call non-static members of the class
 */

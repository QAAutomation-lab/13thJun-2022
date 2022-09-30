package day17This;

class ThisKeyword4 {
	void m() {
		System.out.println("this keyword pointing to: "+this);// prints same reference ID
	}
	
	public static void main(String args[]) {
		ThisKeyword4 obj = new ThisKeyword4();
		
		System.out.println("obj pointing to: "+obj);// prints the reference ID
		obj.m();
	}
}

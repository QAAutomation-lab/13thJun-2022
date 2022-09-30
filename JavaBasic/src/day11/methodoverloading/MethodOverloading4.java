package day11.methodoverloading;

class DisplayOverloading
{
    public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
    public void callMe() {
    	System.out.println("I am callMe() of DisplayOverloading class");
    }
}
public class MethodOverloading4
{
	void callMe() {
		System.out.println("I am callMe() of MethodOverloading4 class");
	}
   public static void main(String args[])
   {
       DisplayOverloading obj = new DisplayOverloading();
       obj.disp('a');
       obj.disp('a',10);
       obj.callMe();
       
       MethodOverloading4 m1=new MethodOverloading4();
       m1.callMe();
   }
}
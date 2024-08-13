package myfirstjava;

public class Staticvariable{

	   static int count=0;
	   public void increment()
	   {
	       count++;
	   }
	   public static void main(String args[])
	   {
		   Staticvariable obj1=new Staticvariable();
		   Staticvariable obj2=new Staticvariable();
	       obj1.increment();
	       obj2.increment();
	       System.out.println("Obj1: count is="+obj1.count);
	       System.out.println("Obj2: count is="+obj2.count);
	   }
}

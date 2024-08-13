package myfirstjava;

public class Static1 {

	   // salary  variable is a private static variable
	   private static double salary;

	   public static final String DEPARTMENT = "Develpor";

	   public static void main(String args[]) {
	      salary = 100000;
	      System.out.println(DEPARTMENT + "salary:" + salary);
	   }
	}


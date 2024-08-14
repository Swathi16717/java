package myfirstjava;
import java.util.Scanner;
public class Calculator {
 public static void main(String[] agrs) {
	 int operator,n1,n2;
	 System.out.println("1-Add 2-Subtract 3-Multiply 4-Divide");
	 System.out.println("choose the operator: ");
	 Scanner s = new Scanner(System.in);
	 operator = s.nextInt();
	 System.out.println("Enter the first number: ");
	 n1=s.nextInt();
	 System.out.println("Enter the second number: ");
	 n2=s.nextInt();
	 int result=0;
	 switch(operator) {
	 case 1:
		 result=n1+n2;
	 break;
	 case 2:
		 result=n1-n2;
	 break;
	 case 3:
		 result=n1*n2;
	 break;
	 case 4:
		 result=n1%n2;
	 break;
	 default:
		 System.out.println("The value is not valid");
	 }
	 System.out.println("Result is:"+result);

 }
		 
	 }
	 
 
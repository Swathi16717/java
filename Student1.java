package myfirstjava;

import java.util.Scanner;

class Student1 
 {
	 private String name;
	 private int rollNumber;
	 private double mark;
  public Student1(String name,int rollNumber,double mark) {
		this.name=name;
		this.rollNumber=rollNumber;
		this.mark=mark;
	}
  public void display()
  {
	    System.out.println("\n\n STUDENT DETIALS:");
		System.out.println("Name:"+name);
		System.out.println("Roll Number:"+rollNumber);
		System.out.println("Mark:"+mark);
  }

 public static void main(String[] args) {
	 Scanner userinput=new Scanner(System.in);
	 System.out.println("Enter your name:");
	 String name=userinput.nextLine();
	 System.out.println("Enter your roll number:");
	 int rollNumber=userinput.nextInt();
	 System.out.println("Enter your marks:");
	 double marks=userinput.nextDouble();
	 Student1 stud=new Student1(name,rollNumber,marks);
	 stud.display();
 }
 }
 
	 
 

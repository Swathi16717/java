package myfirstjava;

public class Student {
	private String name;
	private int age;
	public Student (String name,int age) {
		this.name=name;
		this.age=age;
	}
   public Student (Student s) {
	   this.name=s.name;
	   this.age=s.age;
   }
   public void display() {
	   System.out.println("Name: "+this.name);
	   System.out.println("Age: "+this.age);
   }
   
	   public static void main(String[] args) {
		   Student s=new Student("swathi",20);
		   System.out.println("Dispalying the original object");
		   s.display();
		   System.out.println("Displaying the copied object");
		   Student copiedStudent=new Student(s);
		   copiedStudent.display();
		   
	   }
}



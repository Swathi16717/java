package myfirstjava;

public class Instance {
 String Studentname;
 int Studentroll_no;
 int Studentmark;
 
 Instance(String name,int roll_no){
	 Studentname=name;
	 Studentroll_no=roll_no;
 }
 public void setDetails(int mark) {
	 Studentmark=mark;
	 }
	 public void display() {
		 System.out.println("Studnetname:"+Studentname);
		 System.out.println("Studentroll_no:"+Studentroll_no);
		 System.out.println("Studentmark:"+Studentmark);
	 }
	 public static void main(String[] args) {
		 Instance obj=new Instance("sri",567890);
		 obj.setDetails(455);
		 obj.display();
	 }
 }
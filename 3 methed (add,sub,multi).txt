package myfirstjava;

public class add1 { 
	int add=10;
	int sub=20;
	int multi=10;
	public void display() {
		System.out.println(add);
		System.out.println(sub);
		System.out.println(multi);
	}
public static void main(String[]args) {
	add1 code=new add1();
	code.add=7+3;
	code.sub=10-4;
	code.multi=3*2;
	code.display();
}
}

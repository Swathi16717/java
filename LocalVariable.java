package myfirstjava;

public class LocalVariable {
	void Multiplication() {
		int a=10;
		int b=15;
		System.out.println("Multiplication:"+ a*b);
	}
 public static void main(String[] args) {
	 LocalVariable obj=new LocalVariable();
	 obj.Multiplication();
 }
 
}

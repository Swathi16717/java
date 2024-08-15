package myfirstjava;

public class wrapperClass1 {

public static void main(String[] args) {
	int n = 2;
	boolean n2 = true;
	Integer num = Integer.valueOf(n); 
	Boolean num1 = Boolean.valueOf(n2);
	 Integer j=n;
	 Boolean k=n2;
	 System.out.println("Integer object:"+num);
	 System.out.println("Boolean object:"+num1);
}
}

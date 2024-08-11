package myfirstjava;

public class pattren {
	public static void main(String[] args) {
		int count=1;
		for(int i=1;i<=4;i++) //outer
		{
			for(int j=1;j<=i;j++) { //inner
				System.out.print(count + "  ");
				count++;
				
			}
			System.out.println();
		}
	}
}


//1<=1
//2<=1

//1<=2
//2<=2
//3<=2


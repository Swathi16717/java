public class Oddsum {

	public static void main(String[] args) {
	  int sum = 0;
		for(int i=1;i<=30;i=i+2)
		{
			System.out.println(i);
			sum = sum+i;
		}
		System.out.println("Total : " + sum);
	}

}

package myfirstjava;

public class palindrome {
public static void main(String[] args) {
	int number=4567;
	int originalnum=number;
	int reversenum=0;
	for(;number!=0;)
	{
		int rem=number%10;
		reversenum=reversenum*10+rem;
		number=number/10;
		
	}
    if(originalnum==reversenum) {
    	System.out.println(originalnum+"is palindrome");
    }
    else {
    	System.out.println(originalnum+"is not palindrome");
    	   
    }
    	
    }
}

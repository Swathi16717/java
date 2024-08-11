package second;

public class Overloading {
	    public int add(int x, int y) {
	        return x + y;
	    }
	    public double add(double x, double y) {
	        return x + y;
	    }
	    public float add(float x,float y) {
	    	return x + y;
	    }

	    public static void main(String[] args) {
	        Overloading example = new Overloading();

	        int intResult = example.add(5, 5);
	        System.out.println("Sum of integers: " + intResult);

	        double doubleResult = example.add(5.6, 9.5);
	        System.out.println("Sum of doubles: " + doubleResult);
	        
	        float floatResult = example.add(5,5);
	        System.out.println("Sum of float: " + floatResult);
	        
	    }
	}



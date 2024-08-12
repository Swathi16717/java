package myfirstjava;

	abstract class Animal
	{
		abstract void sound();
	}

	class Lion extends Animal 
	{
		void sound()
		{
			System.out.println("Lion Roars");
		}
	}
	  
	class Tiger extends Animal
	{
		void sound() 
		{
			System.out.println("Tiger groans");
		}

		public static void main(String[] args)
		{
			Animal obj=new Tiger(); 
			obj.sound(); 
			Animal obj1=new Lion();
			obj1.sound(); 
			
		}
	}
	

	


	

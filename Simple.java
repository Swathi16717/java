package myfirstjava;
class Simple{
	int radius;
	String color;
	public Simple() 
	{
		this.radius=1;
		this.color="red";
		
	}
	public Simple(int radius,String color)
	{
		this.radius=radius;
		this.color=color;
		
	}
	public void display()
	{
		System.out.println("Circle is of"+this.radius+"cm radius and is" +this.color + "in color");
	}

	public static void main(String[] args)
	{
	Simple Circle1=new Simple();
	Circle1.display();
	Simple Circle2=new Simple(5,"blue");
	Circle2.display();
	
}
}


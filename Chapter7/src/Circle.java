
public class Circle 
{
	private double radius;//instance variable
	
	
	public Circle() //The constructor method
	{
		radius = 4.5;
	}
	
	public Circle(double r) //Overloading the contructor
	{
		radius = r;
	}
	
	public double getRadius()//Accessor method
	{
		return radius;
	}
	
	public void setRadius(double r)//Modifier method
	{
		radius = r;
	}

	public double area()//Calculates the area of a circle
	{
		double circA = Math.PI * radius * radius;
		
		return circA;//Returns the decimal number associated wit the area
	}
	
	public double circumference()//Calculates the circumference of an area
	{
		double c;
		c = 2 * Math.PI * radius;
		
		return c;
	}
	
	public void displayAreaFormula()//Displays the area formula
	{
		System.out.println("The formula for the area of a circle is A = PI * radius * radius");
	}
	
	public boolean equals(Object c)
	{
		Circle testCirc = (Cirlce)c;
		
		if(testCirc.getRadius() == radius)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
}

package SkillBuilders;

public class Rectangle implements compareTo 
{
	private double length, width;
	
	public Rectangle() //Constructor
	{
		length = 1;
		width = 1;
	}
	
	public Rectangle(double l, double w) //Overload the Constructor
	{
		length = l;
		width = w;
	}
	
	public void setLength(double newL)
	{
		length = newL;
	}
	public void setWidth(double newW)
	{
		width = newW;
	}
	
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	
	//Implement the perimeter method
	
	//Implement displayAreaFormula() method
	
	public boolean equals(Object r)
	{
		Rectangle testObj = (Rectangle) r;
		
		if(testObj.getLength() == length && testObj.getWidth() == width)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		String rectangleS;
		
		rectangleS = "Rectangle has length "+ length +
				"and width " + width;
		
		return rectangleS;
				
	}
	
	public int compareTo(Object r)
	{
		Rectangle testRect = (Rectangle) r;
		
		if(length < testRect.getLength() || width < testRect.getWidth())
		{
			return(-1);
		}
		else if(length == testRect.getLength() && width == testRect.getWidth())
		{
			return(0);
		}
		else
		{
			return(1);
		}
	}
		
	
}

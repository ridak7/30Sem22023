
public abstract class Employee 
{
	String firstName, lastName;
	
	public Employee(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
	}
	
	public String toString()
	{
		return(firstName + " "+ lastName);
	}
	
	abstract double pay(double period);
}

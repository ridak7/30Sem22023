
public class Associate extends Employee 
{
	private double hourlyPayRate;
	
	public Associate(String fN, String lN, double rate)
	{
		super(fN, lN);
		hourlyPayRate = rate;
	}
	
	public double pay(double hours)
	{
		double payEarned;
		
		if(hours > 40)
		{//
			payEarned = ((hourlyPayRate * 40) + (hourlyPayRate * 1.5)*(hours - 40));
		}
		else
		{
			payEarned = hours *hourlyPayRate;
		}
		
		return payEarned;
	}
	
	public String toString()//prints associate object
	{
		return(super.toString() + ", associate" + " "+
						"Pay Rate: "+ hourlyPayRate);
	}
	
	
		
		
}

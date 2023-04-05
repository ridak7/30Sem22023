
public class Manager extends Employee 
{
	private double yearlySalary;
	
	public Manager(String fN, String lN, double salary)
	{
		super(fN, lN);
		yearlySalary = salary;
	}
	
	public double getYearlySalary()
	{
		return yearlySalary;
	}
	
	public void setYearlySalary(double salary)
	{
		yearlySalary = salary;
	}
	
	public double pay(double weeks)
	{
		double payEarned;
		payEarned = (yearlySalary/52)*weeks;
		return payEarned;
	}
	
	public String toString()
	{
		return(super.toString() + ", manager");
	}
	//
	
}

package oops;

public class SavingsAccount extends Account 
{

	private double interest;
	
	public SavingsAccount()
	{
		super();
		interest = 0;
	}
	
	public SavingsAccount(int id, double balance)
	{
		super(id,balance);
		interest = 0.0f;
	}
	
	public SavingsAccount(int id, double balance, double interest)
	{
		super(id,balance);
		this.interest = interest;
	}
		
	public double getInterest()
	{
		return interest;
	}
	
	public void setInterest(double interest)
	{
		this.interest = interest;
	}
	
	public void addInterest()
	{
		deposit(getBalance() * interest/100);
	}
	
	public String toString()
	{
		String result = super.toString() + "\n\tSavings Interest: " + interest + "%\n";
		return result;		
	}
}

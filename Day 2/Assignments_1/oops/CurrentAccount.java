package oops;

public class CurrentAccount extends Account 
{
	private double overdraftLimit;
	
	public CurrentAccount()
	{
		super();
		overdraftLimit = 0.0f;
	}
	
	public CurrentAccount(int id, double balance)
	{
		super(id, balance);
		overdraftLimit = 0.0f;
	}
	
	public CurrentAccount(int id, double balance, double overdraftLimit)
	{
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	public boolean isOverDraft()
	{
		if(getBalance() < 0)
		{
			return true;
		}
		return false;
	}
	
	public void withdraw(double amount) throws IllegalArgumentException
	{
		if(getBalance() - amount < overdraftLimit * -1)
			throw new IllegalArgumentException("Transaction will exceed overdraft limit");
		else
			withdraw(amount);
	}
	
	public void sendLetter()
	{
		System.out.printf("This account is overdrafted by %.2f", getBalance());
	}
	
	public String toString()
	{
		String result = super.toString() + "\n\tOverdraft Limit: $" + overdraftLimit + "\n";
		return result;		
	}
}

package oops;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;
public abstract class Account 
{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account()
	{
		this.id = 0;
		this.balance= 0;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}
	
	public Account(int id, double balance)
	{
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}
	
	public int getID()
	{
		return id;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	public Date getDateCreated()
	{
		return dateCreated;
	}
	public double getMonthlyInterestRate()
	{
		return (double)(annualInterestRate/(100 * 12));
	}
	
	public double getMonthlyInterest()
	{
		return getMonthlyInterestRate() * balance;
	}
	
	public void setID(int id)
	{
		this.id = id;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
	}
	
	public void withdraw(double amount) throws IllegalArgumentException
	{
		if(amount < 0)
			throw new IllegalArgumentException("Amount must be positive");
		else
			balance -= amount;
	}
	
	public void withdraw(Scanner scan)
	{
		Pattern userInputDouble = Pattern.compile("[0-9]+(\\.[0-9]{1,2})?");
		System.out.println("How much do you wish to withdraw:  ");
		while (!scan.hasNext(userInputDouble))
		{
			if(scan.hasNext())
			{
				System.out.println(scan.next() + " is an Improper Entry! Enter a decimal number with a precision of 2 ");
				System.out.println("How much do you wish to deposit:  ");
			}
		}
		this.withdraw(scan.nextDouble());
	}
	
	public void deposit(double amount) throws IllegalArgumentException
	{
		if(amount < 0)
			throw new IllegalArgumentException("Amount must be positive");
		else
			balance += amount;
	}
	
	public void deposit(Scanner scan)
	{
		Pattern userInputDouble = Pattern.compile("[0-9]+(\\.[0-9]{1,2})?");
		System.out.println("How much do you wish to deposit:  ");
		while (!scan.hasNext(userInputDouble))
		{
			if(scan.hasNext())
			{
				System.out.println(scan.next() + " is an Improper Entry! Enter a decimal number with a precision of 2 ");
				System.out.println("How much do you wish to deposit:  ");
			}
		}
		this.deposit(scan.nextDouble());
	}
	
	public String toString()
	{
		String result;
		result = String.format("Account #%d:\n\tBalance: $%.2f\n\tMonthly Interest: $%.2f\n\tDate Created: %4$tA, %4$tB %4$td, %4$tY",
				id, balance, getMonthlyInterest(), dateCreated); 
		return result;
	}
}

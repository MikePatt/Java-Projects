package oops;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Bank 
{
	private int count;
	private static Account[] accounts;
	
	public Bank()
	{
		this.count = 0;
		accounts = new Account[5];
	}
	
	public void update()
	{
		for(Account account: accounts)
		{
			if(account instanceof SavingsAccount) 
			{
				((SavingsAccount) account).addInterest();
			}
			else if(account instanceof CurrentAccount)
			{
				if(((CurrentAccount) account).isOverDraft())
				{
					((CurrentAccount) account).sendLetter();
				}
			}
		}
	}
	
	public void openAccount(int id, Scanner scan)
	{
		Pattern userInput = Pattern.compile("[1-2]"); 
		Pattern userInputDouble = Pattern.compile("[0-9]+(\\.[0-9]{1,2})?");
		System.out.println("What kind of Account do you wish to open:");
		System.out.println("Enter (1) for Current and (2) for Savings");
		while (!scan.hasNext(userInput))
		{
			if(scan.hasNext()) 
				System.out.println(scan.next() + " is an Improper Entry! Enter (1) for Current and (2) for Savings: ");
		}
		int choice = scan.nextInt();
		if(count < accounts.length)
		{
			if(choice == 1)
			{
				System.out.println("What is the Overdraft Limit: ");
				while (!scan.hasNext(userInputDouble))
				{
					if(scan.hasNext()) 
						System.out.println(scan.next() + " is an Improper Entry! Enter a decimal number with a precision of 2!");
						System.out.println("What is the Overdraft Limit: ");
				}
				double limit = scan.nextDouble();
				accounts[count] = new CurrentAccount(id, 0.0f, limit);
				accounts[count].deposit(scan);
				count++;
			}
			else if(choice == 2)
			{
				System.out.println("What is the Interest Rate: ");
				while (!scan.hasNext(userInputDouble))
				{
					if(scan.hasNext())
					{
						System.out.println(scan.next() + " is an Improper Entry! Enter a decimal number with a precision of 2 ");
						System.out.println("What is the Interest Rate: ");
					}
				}
				double rate = scan.nextDouble();
				accounts[count] = new SavingsAccount(id, 0.0f, rate);
				accounts[count].deposit(scan);
				count++;
			}
		}
	}
	
	public void closeAccount(int id)
	{
		for(Account account: accounts)
		{
			if (account.getID() == id)
			{
				account = null;
				count--;
			}
		}
	}
	
	public int bankLength()
	{
		return accounts.length;
	}
	
	public String toString()
	{
		String result = "";
		for(Account account: accounts)
		{
			result += account.toString();
		}
		return result;
	}
	
	public Account getAccount(int id)
	{
		Account result = null;
		for(Account account: accounts)
		{
			if(account.getID() == id)
			{
				result = account;
				break;
			}
		}
		return result;
	}
}

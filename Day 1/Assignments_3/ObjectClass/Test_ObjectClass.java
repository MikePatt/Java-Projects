package ObjectClass;

public class Test_ObjectClass 
{

	public static void main(String[] args) 
	{
		Account account = new Account(1122, 20000.00);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		
		System.out.println(account);
	}

}

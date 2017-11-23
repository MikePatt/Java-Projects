package oops;

import java.util.Scanner;

public class Test_oops 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Bank bank = new Bank();
		for(int i = 0; i < bank.bankLength(); i++)
		{
			bank.openAccount(i, scan);
			
		}
		System.out.print(bank);
		bank.update();
		System.out.println();
		System.out.println();
		System.out.print(bank);
		for(int i = 0; i < bank.bankLength(); i++)
		{
			bank.closeAccount(i);
		}
		scan.close();
	}

}

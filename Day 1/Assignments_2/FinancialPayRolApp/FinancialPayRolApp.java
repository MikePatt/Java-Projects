package FinancialPayRolApp;

import java.util.Scanner;
public class FinancialPayRolApp{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee's name: ");
		String name = sc.nextLine();
		System.out.println("Enter number of hours worked in a week: ");
		float hours = sc.nextFloat();
		System.out.println("Enter hourly pay rate: ");
		float payRate = sc.nextFloat();
		System.out.println("Enter federal tax withholding rate: ");
		float fedRate = sc.nextFloat();
		System.out.println("Enter state tax withholding rate: ");
		float stateRate = sc.nextFloat();
		
		
		System.out.println("Employee Name: " + name);
		System.out.format("Hours Worked: %.2f%n", hours);
		System.out.format("Pay Rate: %.2f%n", payRate);
		float grossPay = payRate * hours;
		System.out.format("Gross Pay: $%.2f%n", grossPay);
		System.out.println("Deductions:");
		float fedDuct = fedRate/100 * grossPay;
		System.out.format("\tFederal Withholding (%.2f%%): $%.2f%n", fedRate, fedDuct);
		float stateDuct = stateRate/100 * grossPay;
		System.out.format("\tState Withholding (%.1f%%): $%.2f%n", stateRate, stateDuct);
		System.out.format("\tTotal Deduction: $%.1f%n", (stateDuct + fedDuct));
		System.out.format("Net Pay: $%.2f%n", (grossPay - (stateDuct + fedDuct)));
		sc.close();
	}
}
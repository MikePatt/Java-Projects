package Datatypes_operators;

import java.util.Scanner;
public class Datatypes_operators
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int x = sc.nextInt();
		int y = sc. nextInt();
		System.out.println(x + "\t" + square(x) + "\t" + cube(x));
		System.out.println(y + "\t" + square(y) + "\t" + cube(y));
		sc.close();
	}
	
	public static int square(int x) 
	{
		return x * x;
	}
	
	public static int cube(int x) 
	{
		return x * x * x;
	}
}
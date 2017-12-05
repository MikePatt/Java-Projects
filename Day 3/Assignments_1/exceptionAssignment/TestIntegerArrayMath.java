package exceptionAssignment;

import java.util.Random;

public class TestIntegerArrayMath 
{
	public static void main(String[] args) 
	{
		int[] arr1 = { 0, 10, 20, 30, 40, 50 };
		int[] arr2 = { 0, 2, 3, 5, 7, 11 };

		int [] randArray1 = new int[10]; // create the Array with 10 slots
		int [] randArray2 = new int[10]; // create the Array with 10 slots
		Random rand = new Random(); // create a local variable for Random
		for(int i = 0; i < randArray1.length; i++) // create a loop that executes 10 times
		{
			randArray1[i] = rand.nextInt(50) + 50;
			randArray2[i] = rand.nextInt(50);
		}

		IntegerArrayMath iam1 = new IntegerArrayMath(arr1, arr2);
		IntegerArrayMath iam2 = new IntegerArrayMath(randArray1, randArray2);
		System.out.println("Given Arrays");
		iam1.integerDivision();
		System.out.println("\nRandom Arrays");
		iam2.integerDivision();
	}
}
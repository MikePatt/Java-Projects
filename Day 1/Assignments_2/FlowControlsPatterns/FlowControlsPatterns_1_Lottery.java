/**
 *FlowControlsPatterns_1_Lottery.java --- program to generate a lottery of a three digit
 *number. The program prompts the user to enter a three-digit number and
 *determines whether the user wins according to the following rules:
 *	1. If the user input matches the lottery number in the exact order, the award is
 *	   $10,000.
 *	2. If all the digits in the user input match all the digits in the lottery number, the
 *	   award is $3,000.
 *	3. If one digit in the user input matches a digit in the lottery number, the award is
 *	   $1,000.
 * @author    Michael Patterson
 */
package FlowControlsPatterns;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;
public class FlowControlsPatterns_1_Lottery
{

	public static int OUT_OF_SCOPE = 11;
	
	 /**
	   * Generates a lottery of a three digit number,
	   * prompts the user to enter a three-digit
	   * number, and determines whether the user wins
	   * @param args A string array containing 
	   * the command line arguments.
	   * @return No return value.
	   */
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int lotto = rand.nextInt(1000);
		int guess = getUserGuess();
		getResults(lotto, guess);		
	}
	
	 /**
	   * Turns integer into an array representation of its individual digits.
	   * @param x a positive integer of indeterminate size 
	   * @return the array representation of an the individual digits of the argument
	   * @exception IllegalArgumentException
	   */
	public static int[] makeIntArray(int x)
	{
		if(x >= 0)
		{
			int count = getNumberLength(x);
			int[] x_array = new int[count];
			for(int i = count - 1; i >= 0; i--)
			{
				x_array[i] = x % 10;
				x /= 10;
			}
			return x_array;
		}
		else
			throw new IllegalArgumentException("x must be positive");
	}
	
	/**
	   * Returns the amount of digits an integer has
	   * @param x a positive integer of indeterminate size 
	   * @return an integer containing the amount of digits contained in the argument
	   * @exception IllegalArgumentException
	   */
	public static int getNumberLength(int x)
	{
		if(x < 0)
			throw new IllegalArgumentException("x must be positive");
		else
		{
			int count = 0;
			if(x > 0)
			{
				while(x != 0)
				{
					x /= 10;
					count++;
				}
			}
			else if (x == 0)
			{
				return 1;
			}
			return count;
		}
	}
	
	/**
	   * Counts the number of matches between two integer arrays
	   * @param x an integer array to be compared
	   * @param y an integer array to be compared
	   * @return an integer containing the number of matches between the two arguments
	   */
	public static int getMatches(int[] x, int[] y)
	{
		int matches = 0;
		for(int i = 0; i < x.length; i++)
		{
			for(int j = 0; j < y.length; j++)
			{
				if(x[i] == y[j])
				{
					y[j] = OUT_OF_SCOPE;
					matches++;
					break;
				}
			}
		}
		return matches;
	}
	
	/**
	   *  Prints a prompt that asks for a three digit integer input,
	   *  gets a three digit integer from user and finally returns it
	   * @return an integer containing three digits
	   */
	public static int getUserGuess()
	{
		Scanner scan = new Scanner(System.in);
		Pattern threeDigitNumber = Pattern.compile("\\d{3}");
		System.out.println("Please Enter a Positive Three Digit Number");
		while (!scan.hasNext(threeDigitNumber))
		{
			if(scan.hasNext()) 
				System.out.println(scan.next() + " is not a Three Digit Number! Please Try Again: ");
		}
		int x = scan.nextInt();
		scan.close();
		return x;
	}
	
	/**
	   * Prints out the lottery number and the user's guess number,
	   * determines if there are any matches between the two, 
	   * and finally prints out the results accordingly
	   * @param lotto a positive integer of indeterminate size
	   * @param guess a positive integer of indeterminate size
	   * @exception IllegalArgumentException
	   */
	public static void getResults(int lotto, int guess)
	{
		
		if(lotto < 0 || guess < 0)
			throw new IllegalArgumentException("lotto and guess must be positive");
		else
		{
			System.out.printf("Lotto Number: %03d%n", lotto);
			System.out.printf("Guess Number: %03d%n", guess);
			if(guess == lotto) 
			{
				System.out.println("You Won! Your Award is $10,000.");
			}
			else 
			{
				int[] lottoArray = makeIntArray(lotto);
				int[] guessArray = makeIntArray(guess);
				
				int matches = getMatches(lottoArray, guessArray);
				
				if (matches == 0)
					System.out.println("You Lost!");
				else
					System.out.printf("You Won! Your Award is $%d.%n", 1000 * matches);
			}
		}
	}
}


/**
 * FlowControlsPatterns_2_Series.java --- program to count positive and negative numbers
 * and compute the average of numbers
 * @author    Michael Patterson
 */
package FlowControlsPatterns;

import java.util.Scanner;
public class FlowControlsPatterns_2_Series 
{
	/**
	 * Program that reads an unspecified number of integers,
	 * determines how many positive and negative values have 
	 * been read, and computes the total and average of the 
	 * input values (not counting zeros). Program ends with
	 * the input 0 and displays the average as a floating-point number.
	 * @param args A string array containing the command line arguments.
	 * @return No return value.
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a series of integers, end the series with 0:");
		int x = sc.nextInt();
		int posNum = 0;
		int negNum = 0;
		int sum = 0;
		int count = 0;
		while(x != 0 && sc.hasNextInt())
		{
			++count;
			if(x < 0) 
			{
				++negNum;
			}
			else
			{
				++posNum;
			}
			sum += x;
			x = sc.nextInt();
		}
		float avg = (float)(sum)/(float)(count);
		System.out.format("The number of positives is %d%n", posNum);
		System.out.format("The number of negatives is %d%n", negNum);
		System.out.format("The total is %d%n", sum);
		System.out.format("The average is %.2f%n", avg);
		sc.close();
	}
}
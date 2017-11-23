/**
 *FlowControlsPatterns_3_Patterns.java --- program to display four patterns using loops Use nested loops that display the following
 *patterns in four separate functions:
 *Pattern A      Pattern B    Pattern C    Pattern D
 *1          	1 2 3 4 5 6       1 	1 2 3 4 5 6
 *1 2     	    1 2 3 4 5       2 1   	  1 2 3 4 5
 *1 2 3   	    1 2 3 4       3 2 1         1 2 3 4
 *1 2 3 4 	    1 2 3       4 3 2 1           1 2 3
 *1 2 3 4 5 	1 2 	  5 4 3 2 1 	    	1 2
 *1 2 3 4 5 6 	1 	    6 5 4 3 2 1 	          1
 * @author    Michael Patterson
 */
package FlowControlsPatterns;

public class FlowControlsPatterns_3_Patterns 
{
	/**
	 * Prints four different patterns 
	 * @param args A string array containing 
	 * the command line arguments.
	 * @return No return value.
	 */
	public static void main(String[] args) 
	{
		patternA();
		patternB();
		patternC();
		patternD();
	}
	
	/**
	 * Prints Pattern A<br/>
	 * <i>Pattern A<br/>
	 * 1<br/>          	
	 * 1 2<br/>     	    
	 * 1 2 3<br/>   	    
	 * 1 2 3 4<br/> 	    
	 * 1 2 3 4 5<br/> 	
	 * 1 2 3 4 5 6</i>
	 * @return No return value.
	 */
	public static void patternA()
	{
		System.out.println("\nPattern A");
		for(int i = 1; i <= 6; i++) 
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.format("%d ", j);
			}
			System.out.print('\n');
		}
	}
	
	/**
	 * Prints Pattern B<br/>
	 * <i>Pattern B<br/>
	 * 1 2 3 4 5 6<br/>          	
	 * 1 2 3 4 5<br/>     	    
	 * 1 2 3 4<br/>   	    
	 * 1 2 3<br/> 	    
	 * 1 2<br/> 	
	 * 1</i>
	 * @return No return value.
	 */
	public static void patternB()
	{
		System.out.println("\nPattern B");
		for(int i = 6; i >= 1; i--) 
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.format("%d ", j);
			}
			System.out.print('\n');
		}
	}
	/**
	 * Prints Pattern C<br/>
	 * <i>Pattern C<br/>
	 * &#8195;&#8195;&#8195;&#8195;&#8195;1<br/>          	
	 * &#8195;&#8195;&#8195;&#8195;1 2<br/>     	    
	 * &#8195;&#8195;&#8195;1 2 3<br/>   	    
	 * &#8195;&#8195;1 2 3 4<br/> 	    
	 * &#8195;1 2 3 4 5<br/> 	
	 * 1 2 3 4 5 6</i>
	 * @return No return value.
	 */
	public static void patternC()
	{
		System.out.println("\nPattern C");
		for(int i = 1; i <= 6; i++) 
		{
			for(int j = 1; j <= 6 - i; j++)
			{
				System.out.format("  ");
			}
			for(int j = i; j >= 1; j--)
			{
				System.out.format("%d ", j);
			}
			System.out.format("%n");
		}
	}
	/**
	 * Prints Pattern D<br/>
	 * <i>Pattern D<br/>
	 * 1 2 3 4 5 6<br/>          	
	 * &#8195;1 2 3 4 5<br/>     	    
	 * &#8195;&#8195;1 2 3 4<br/>   	    
	 * &#8195;&#8195;&#8195;1 2 3<br/> 	    
	 * &#8195;&#8195;&#8195;&#8195;1 2<br/> 	
	 * &#8195;&#8195;&#8195;&#8195;&#8195;1</i>
	 */
	public static void patternD()
	{
		System.out.println("\nPattern D");
		for(int i = 6; i >= 1; i--) 
		{
			for(int j = 1; j <= 6 - i; j++)
			{
				System.out.format("  ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.format("%d ", j);
			}
			System.out.print('\n');
		}
	}
}

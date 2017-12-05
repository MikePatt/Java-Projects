package exceptionAssignment;

public class IntegerArrayMath 
{
	private int[] number;
	private int[] denom;

	// constructor to initialize the above two arrays
		public IntegerArrayMath(int[] number, int[] denom)
	{
		this.number = number;
		this.denom = denom;
	}
	
	@SuppressWarnings("serial")
	private class NonIntegerResultException extends RuntimeException
	{
		private int x;
		private int y;
		
		public NonIntegerResultException(int x, int y)
		{
			super(String.format("result of %d divided by %d is not an integer%n", x, y));
			this.x = x;
			this.y = y;
		}
	}
	
	public void integerDivision() 
	{
		for(int i = 0; i < number.length; i++)
		{
			try 
			{
				if(number[i]%denom[i] == 0)
					System.out.printf("%d/%d is %d%n", number[i], denom[i], number[i]/denom[i]);
				else
					throw new NonIntegerResultException(number[i], denom[i]);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Division by zero is undefined");
			}
			catch(NonIntegerResultException nire)
			{
				System.out.printf("result of %d divided by %d is not an integer%n", nire.x, nire.y);
			}
		}
	}
}


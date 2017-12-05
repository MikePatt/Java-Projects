package exceptions;

public class ZeroAsArgumentException extends IllegalArgumentException 
{
	public ZeroAsArgumentException()
	{
		super("You cannot withdraw an amount of zero");
	}
}

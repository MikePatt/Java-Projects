package exceptions;

public class ImproperStringFormatException extends IllegalArgumentException 
{ 
	private String tip;

	public ImproperStringFormatException(String message) 
	{
		this.tip = message;
	}

	public void printTip() 
	{
		System.out.printf("%s%n", tip);
	}
}

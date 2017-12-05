package exceptions;

class NotBinaryStringException extends ImproperStringFormatException 
{
	public NotBinaryStringException(String message) 
	{
		super(message);
	}
}

public class ArrayIndexOutOfBoundsExceptionTest 
{	
	public static void main(String[] args)
	{
		String[] name = {"tom", "dick", "harry"};
		for(int i = 0; i<=name.length; i++) 
		{
			try
			{
				System.out.print(name[i] +'\n');
			}
			catch(ArrayIndexOutOfBoundsException aiobe)
			{
				System.out.printf("Index %d is out of bounds%n", i);
			}
		}
		for(int i = 0; i < name.length; i++) 
		{
			try
			{
				System.out.print(binaryToDecimal(name[i]) +'\n');
			}
			catch(NotBinaryStringException nbse)
			{
				nbse.printTip();
				System.out.print("BOO!\n");
			}
		}
	}
	
	public static int binaryToDecimal(String binary) throws NotBinaryStringException
	{
		if(!binary.matches("[0-1]+?"))
		{
			throw new NotBinaryStringException("The string " + binary +" is not a binary string");
		}
		return Integer.parseInt(binary, 2);
	}
}


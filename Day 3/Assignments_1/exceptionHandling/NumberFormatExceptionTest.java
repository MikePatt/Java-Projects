package exceptionHandling;

public class NumberFormatExceptionTest {
	
	public static int binaryToDecimal(String binary) throws NumberFormatException
	{
		if(!binary.matches("[0-1]+?"))
		{
			throw new NumberFormatException("The string " + binary +" is not a binary string");
		}
		return Integer.parseInt(binary, 2);
	}

	public static void main(String[] args) 
	{
		System.out.println(binaryToDecimal(""));
		System.out.println(binaryToDecimal("0010"));
		System.out.println(binaryToDecimal("000"));
		System.out.println(binaryToDecimal("1010"));
		System.out.println(binaryToDecimal("001"));
	}

}

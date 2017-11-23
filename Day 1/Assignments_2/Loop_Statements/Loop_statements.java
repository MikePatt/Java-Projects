package Loop_Statements;
public class Loop_statements
{
	public static void main(String[] args)
	{
		String result = "";
		for(int i = 1; i <= 7; i++)
		{
			result = result + Integer.toString(i);
			System.out.print(result);
			for(int j = i; j < 7; j++)
			{
				if(j == 6)
					System.out.print("*\n");
				else
					System.out.print("*");
			}
		}
	}
}
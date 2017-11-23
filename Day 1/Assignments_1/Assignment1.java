
public class Assignment1 
{
	public static void main(String[] args) 
	{
		final int CurrentPop = 312032486;
		final double YearLength = 365 * 24 * 60 * 60;
		
		for(int i = 1; i <= 5; i++) 
		{
			System.out.println("Population after " + i + " year(s) is " + EstimatedPop(i,CurrentPop, YearLength));
		}
	}
	
	public static int EstimatedPop(int years, int currpop, double yearsecs) 
	{
		double birthrate = 1.00d/7.00d;
		double deathrate = 1.00d/13.00d;
		double immigrate = 1.00d/45.00d;
		int newpop = (int)(currpop + (years * yearsecs * birthrate) + (years * yearsecs * immigrate) - (years * yearsecs * deathrate));
		return newpop;
	}
}
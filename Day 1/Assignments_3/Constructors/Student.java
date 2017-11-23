package Constructors;

public class Student
{
	private String firstName, lastName;
	private Address homeAddress, schoolAddress;
	float [] testScores;
	//-----------------------------------------------------------------
	// Sets up this Student object with the specified initial values.
	//-----------------------------------------------------------------
	public Student (String first, String last, Address home, Address school)
	{
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		testScores = new float[3];
	}
	public Student (String first, String last, Address home, Address school, float[] scores)
	{
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		testScores = scores;
	}
	//-----------------------------------------------------------------
	// Returns this Student object as a string.
	//-----------------------------------------------------------------
	public String toString()
	{
		String result;
		result = firstName + " " + lastName + "\n\n";
		result += "Home Address:\n" + homeAddress + "\n\n";
		result += "School Address:\n" + schoolAddress +"\n\n";
		result += "Test Scores:\n";
		for(int i = 0; i < testScores.length; i++)
		{
			if(i == 2)
				result += Float.toString(testScores[i]) + "\n\n";
			else
				result += Float.toString(testScores[i]) + ", ";
		}
		result += "Average:\n" + Float.toString(average()) + "\n";
		return result;
	}
	
	public void setTestScore(int number, float score)
	{
		if(number < 1 || number > 3)
			throw new IllegalArgumentException("number must be between 1 and 3 inclusive");
		else if(score < 0 || score > 100)
			throw new IllegalArgumentException("score must be between 0 and 100 inclusive");
		else
			testScores[number - 1] = score;
	}
	
	public void setTestScore(float[] scores)
	{
		if(scores.length != 3 )
			throw new IllegalArgumentException("scores must contain three floats");
		else
			testScores= scores;
	}
	
	public float getTestScore(int number)
	{
		if(number < 1 || number > 3)
			throw new IllegalArgumentException("number must be between 1 and 3 inclusive");
		else
			return testScores[number - 1];
	}
	
	public float average()
	{
		float avg = 0;
		for(float element: testScores)
			avg += element;
		avg/=testScores.length;
		return avg;
	}
}

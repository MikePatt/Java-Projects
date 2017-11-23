package Constructors;
public class Course
{
	private String courseName;
	private Student[] students;
	private int count;
	
	public Course(String name)
	{
		courseName = name;
		students = new Student[5];
		count = 0;
	}
	
	public void addStudent(Student addition)
	{
		if(count >= 5)
		{
			return;
		}
		else if(addition == null)
			throw new IllegalArgumentException("addition cannot be null");
		else
		{
			students[count] = addition;
			count++;
		}
	}
	
	public float average() 
	{
		float avg = 0;
		for(int i = 0; i < count; i++)
		{
			avg += students[i].average();
		}
		avg/=count;
		return avg;
	}
	
	public String roll()
	{
		String result = "";
		for(int i = 0; i < count; i++)
		{
			result += students[i] + "\n";
		}
		return result;
	}
	
	public String toString()
	{
		String result;
		result = courseName + ": \n" + roll() + "Test Average: " + average() + "\n";		
		return result;
	}
}
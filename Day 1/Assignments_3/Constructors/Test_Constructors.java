package Constructors;
import java.util.Random;
public class Test_Constructors 
{
	public static void main(String[] args) 
	{
		Address home = new Address("1240 East 38th Street Apt D2", "Brooklyn", "NY", "11210");
		Address school = new Address("695 Park Ave", "New York", "NY", "10023");
		Student stud1 = new Student("Michael", "Patterson", home, school);
		float[] scores = {(float) 75.0, (float) 100.0, (float) 80.0};
		stud1.setTestScore(scores);
		System.out.println(stud1);
		
		Course course = new Course("Math");
		Student[] students = {
				new Student("Bozo", "Ngo", new Address("123 6th St.", "Melbourne", "FL", "32904"), school),
				new Student("Isabelle", "Van Daal", new Address("70 Bowman St.","South Windsor","CT","06074"), school),
				new Student("Makena", "Keller", new Address("44 Shirley Ave.","West Chicago","IL","60185"), school),
				new Student("Farrah", "Hayward", new Address("71 Pilgrim Avenue","Chevy Chase","MD","20815"), school),
				new Student("Arjun", "Acquati", new Address("514 S. Magnolia St.","Orlando","FL","32806"), school)
							  };
		Random rand = new Random();
		for(int i = 0; i < students.length; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				students[i].setTestScore(j + 1, rand.nextFloat() * 75 + 25);
			}
			course.addStudent(students[i]);
		}
		
		System.out.println(course);
	}

}

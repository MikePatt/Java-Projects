package Inheritance_Poly;

import Constructors.Address;

public class Test_Inheritance_Poly 
{
	public static void main(String[] args)
	{
		Address home = new Address("1240 East 38th Street Apt D2", "Brooklyn", "NY", "11210");
		Address school = new Address("695 Park Ave", "New York", "NY", "10023");
		Student stud1 = new Student("Michael Patterson", home, "3473702167", "mbpatterson236@gmail.com", ClassStatus.FRESHMAN );
		Faculty fac1 = new Faculty("Nikole DeBarge", home, "3474528745", "brown@boardofed.edu", school, 14.50f, "9 - 10", "Dean");
		Person pers1 = new Person("George Shrink", home, "6985214722", "poly@polyh.com");
		Staff staff1 = new Staff("Debbie Downer", home, "6985214785", "downer@downer.com", school, 9.50f, "Janitor");
		Employee empl1 = new Employee("Osmosis Jones", home, "4563218996", "ozzy@drix.com", school, 14.50f);
		System.out.println("" + stud1 + fac1 + pers1 + staff1 + empl1);
	}
}

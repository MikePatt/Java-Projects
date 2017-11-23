package Inheritance_Poly;

import Constructors.Address;

public class Student extends Person 
{	
	private ClassStatus classStatus;
	
	public Student(String name, Address address, String phoneNumber, String emailAddress, ClassStatus classStatus)
	{
		super(name, address, phoneNumber, emailAddress);
		this.classStatus = classStatus;
	}
	
	public ClassStatus getClassStatus() 
	{
		return classStatus;
	}
}

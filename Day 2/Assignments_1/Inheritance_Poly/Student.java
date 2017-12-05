package Inheritance_Poly;

import Constructors.Address;

public class Student extends Person 
{	
	private ClassStatus classStatus;
	
	public Student(String name, Address address, String phoneNumber, String emailAddress, ClassStatus classStatus) throws IllegalArgumentException
	{
		super(name, address, phoneNumber, emailAddress);
		this.classStatus = classStatus;
	}
	
	public void setPhoneNumber(String phoneNumber) throws ImproperStringFormatException
	{
		if(!phoneNumber.matches("\\d{10,11}"))
		{
			throw new ImproperStringFormatException("The number is invalid");
		}
		this.setPhoneNumber(phoneNumber);
	}
	
	public ClassStatus getClassStatus() 
	{
		return classStatus;
	}
}

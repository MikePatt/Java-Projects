package Inheritance_Poly;

import Constructors.Address;

public class Person 
{	
	String name;
	Address streetAddress;
	String phoneNumber;
	String emailAddress;
	
	public String toString()
	{
		String result = String.format("%s%n%s%n", name, this.getClass().getSimpleName());
		return result;
	}
	
	public Person(String name, Address address, String phoneNumber, String emailAddress)
	{
		this.name = name;
		this.streetAddress = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
}

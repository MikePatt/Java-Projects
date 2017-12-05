package Inheritance_Poly;

import Constructors.Address;

public class Person 
{	
	private String name;
	private Address streetAddress;
	private String phoneNumber;
	private String emailAddress;
	
	public String toString()
	{
		String result = String.format("%s%n%s%n", name, this.getClass().getSimpleName());
		return result;
	}
	
	public Person(String name, Address address, String phoneNumber, String emailAddress) throws IllegalArgumentException
	{
		if(!phoneNumber.matches("\\d{10,11}"))
		{
			throw new IllegalArgumentException("The number is invalid");
		}
		this.name = name;
		this.streetAddress = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	
	public void setPhoneNumber(String number) throws IllegalArgumentException
	{
		if(!number.matches("[0-9]{10,11}"))
		{
			throw new IllegalArgumentException("The argument is illegal");
		}
		this.phoneNumber = number;
	}
}

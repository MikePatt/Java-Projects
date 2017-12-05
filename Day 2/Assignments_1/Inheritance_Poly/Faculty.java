package Inheritance_Poly;

import Constructors.Address;

public class Faculty extends Employee 
{
	private String officeHours;
	private String rank;
	
	public Faculty(String name, Address address, String phoneNumber, String emailAddress, Address office, double salary, String officeHours, String rank)
	{
		super(name, address, phoneNumber, emailAddress, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public String getOfficeHours()
	{
		return officeHours;
	}
	
	public String getRank()
	{
		return rank;
	}
	
	public void setOfficeHours(String officeHours)
	{
		this.officeHours = officeHours;
	}
	
	public void setRank(String rank)
	{
		this.rank = rank;
	}
	
	public void setPhoneNumber(String phoneNumber) throws NotPhoneStringException
	{
		if(!phoneNumber.matches("[0-9]{10,11}"))
		{
			throw new NotPhoneStringException("Not a proper phone number");
		}
		this.setPhoneNumber(phoneNumber);
	}
}

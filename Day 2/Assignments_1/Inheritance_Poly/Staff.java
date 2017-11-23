package Inheritance_Poly;

import Constructors.Address;

public class Staff extends Employee 
{
	private String title;
	
	public Staff(String name, Address address, String phoneNumber, String emailAddress, Address office, double salary, String title)
	{
		super(name, address, phoneNumber, emailAddress, office, salary);
		this.title = title;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
}

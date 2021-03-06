package Inheritance_Poly;

import java.util.Date;

import Constructors.Address;

public class Employee extends Person 
{
	private Address office;
	private double salary;
	private Date dateHired;
	
	public Employee(String name, Address address, String phoneNumber, String emailAddress, Address office, double salary)
	{
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		this.dateHired = new Date();
	}
	
	public void setPhoneNumber(String phoneNumber) throws ImproperStringFormatException
	{
		if(!phoneNumber.matches("[0-9]{10,11}"))
		{
			throw new ImproperStringFormatException("The string is improper");
		}
		this.setPhoneNumber(phoneNumber);
	}
	
	public Address getOffice()
	{
		return office;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public Date getDateHired()
	{
		return dateHired;
	}
	
	public void setOffice(Address office)
	{
		this.office = office;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
}

package Constructors;

public class Address 
{ 
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    
    public Address(String streetAddress, String city, String state, String zipCode)
	{ 
	    this.streetAddress = streetAddress;
	  	this.city = city;
	  	this.state = state;
	  	this.zipCode = zipCode;
	}
    
    public String toString()
    { 
    	return streetAddress + "\n" + city + ", " + state + ", " + zipCode;
    }
}

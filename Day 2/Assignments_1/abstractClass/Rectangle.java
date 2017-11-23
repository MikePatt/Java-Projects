package abstractClass;

public class Rectangle extends Shape 
{
	@Override
	public void printArea() 
	{
		System.out.printf("The area of the shape is %d.", x * y);
	}

}

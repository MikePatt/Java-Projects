package abstractClass;

public class Triangle extends Shape 
{
	@Override
	public void printArea() 
	{
		System.out.printf("The area of the shape is %d.", (x/2) * y);
	}

}

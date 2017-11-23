package abstractClass;

public class Circle extends Shape 
{
	@Override
	public void printArea() 
	{
		System.out.printf("The area of the shape is %d.", Math.pow((double)(x), 2) * Math.PI);
	}

}

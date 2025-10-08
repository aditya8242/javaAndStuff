class MyRectangle
{
	int length;
	int breadth;
	
	MyRectangle() // default constructor
	{
		length = 0;
		breadth = 0;
	}
	
	MyRectangle(int length, int breadth) // parameterised constructor
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	int area()
	{
		return length * breadth;
	}
}

public class RectangleTest
{
	public static void main(String[] args)
	{
		MyRectangle r1 = new MyRectangle();
		System.out.println("Area =" + r1.area());
		MyRectangle r2 = new MyRectangle(10, 20);
		System.out.println("Area =" + r2.area());
	}
}

import java.util.*;

public class AreaRectangle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
		int length = sc.nextInt();
		System.out.print("Enter breadth: ");
		int breadth = sc.nextInt();
		int area = length * breadth;
		System.out.println("Area: " + area);
		int perimeter = 2 * (length * breadth);
		System.out.println("Perimeter: " + perimeter);
	}
}

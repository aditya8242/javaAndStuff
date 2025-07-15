import java.util.*;

class MyNumber{
	int num;
	public MyNumber()
	{
		num = 0;
	}
	
	public MyNumber(int num)
	{
		this.num = num;
	}
	
	public void isNegative()
	{
		if(this.num < 0)
		{
			System.out.println("Number is negative.");
		}
	}
	
	public void isPositive()
	{
		if(this.num > 0)
		{
			System.out.println("Number is positive.");
		}
	}
	
	public void isZero()
	{
		if(this.num == 0)
		{
			System.out.println("Number is zero.");
		}
	}
	
	public void isEven()
	{
		if(this.num % 2 == 0)
		{
			System.out.println("Number is even.");
		}
	}
	
	public void isOdd()
	{
		if(this.num % 2 != 0)
		{
			System.out.println("Number is odd.");
		}
	}
	
	public static void main(String[] args){
		MyNumber n1 = new MyNumber();
		if(args.length > 0)
		{
			int n = Integer.parseInt(args[0]);
			MyNumber n2 = new MyNumber(n);
			n2.isNegative();
			n2.isPositive();
			n2.isZero();
			n2.isEven();
			n2.isOdd();
		}
		else
		{
			System.out.println("Insufficient arguments");
		}
	}
}

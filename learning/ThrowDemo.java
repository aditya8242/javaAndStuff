import java.util.*;

class AgeInvalidException extends Exception
{
	public AgeInvalidException(String str)
	{
		super(str);
	}
}

class ThrowDemo
{
    public static void main(String A[])
    {
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter your age: ");
		int iAge = sobj.nextInt();

		try
		{
			if(iAge < 18)
			{
				throw new AgeInvalidException("Your age is below 18");
			}
		}
		catch(AgeInvalidException aobj)
		{
			System.out.println(aobj);
		}

    }
}
import java.util.*;

class ExceptionDemo8
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0, iAns = 0;

        System.out.println("Enter first number: ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter second number: ");
        iNo2 = sobj.nextInt();

        try
        {
            System.out.println("Inside try block");
            iAns = iNo1 / iNo2;
        }
        catch(ArithmeticException aobj)     // Specific catch
        {
            System.out.println("Inside catch block");
            System.out.println(aobj);
        }
        catch(Exception eobj)              // Generic catch 
        {
            System.out.println("Inside Generic catch");
        }
        finally
        {
            System.out.println("Inside finally block");
        }
        

        System.out.println("Division is " + iAns);
    }
}
import java.util.*;

class ExceptionDemo10
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {10, 20, 30, 40, 50};
        int iIndex = 0, iData = 0;

        System.out.println("Enter index number: ");
        iIndex = sobj.nextInt();

        try
        {  
            System.out.println("Inside try");
            iData = Arr[iIndex]; // exception prone code
        }
        catch(Exception eobj)
        {
            System.out.println("Inside catch");
            System.out.println(eobj);
        }
        finally
        {
            System.out.println("Inside finally");
        }

        System.out.println("Element at that index is " + iData);
    }
}
import java.util.Scanner;

class InputOutput
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int No1 = 0, No2 = 0;
        int iAns = 0;

        System.out.println("Enter first number: ");
        No1 = sobj.nextInt();

        System.out.println("Enter second number: ");
        No2 = sobj.nextInt();

        iAns = No1 + No2;

        System.out.println("Addition is " + iAns);
    }
}
import java.util.Scanner;

class SelectionDemo1
{
    public static void main(String A[])
    {
        int iNo = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your age");
        iNo = sobj.nextInt();

        if(iNo >= 18)
        {
            System.out.println("You can vote");
        }
        else
        {
            System.out.println("You can't vote");
        }
    }
}
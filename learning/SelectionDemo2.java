import java.util.Scanner;

class SelectionDemo2
{
    public static void main(String A[])
    {
        int iStd = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your standard");
        iStd = sobj.nextInt();

        if(iStd == 1)
        {
            System.out.println("Exam at 9 am");
        }
        else if(iStd == 2)
        {
            System.out.println("Exam at 10 am");
        }
        else if(iStd == 3)
        {
            System.out.println("Exam at 11 am");
        }
        else if(iStd == 4)
        {
            System.out.println("Exam at 12 NOON");
        }
        else
        {
            System.out.println("Invalid standard");
        }
    }
}
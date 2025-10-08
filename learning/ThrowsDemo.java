class Demo
{
    public int Division(int iNo1, int iNo2) throws ArithmeticException
    {
        int iAns = 0;
        iAns = iNo1 / iNo2;
        return iAns;
    }
}

class ThrowsDemo
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        int Ret = 0;

        try
        {
            Ret = dobj.Division(11, 0);
        }
        catch(ArithmeticException eobj)
        {
            System.out.println("Inside catch " + eobj);
        }
        System.out.println("Division is " + Ret);
    }
}
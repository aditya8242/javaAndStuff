class Demo
{
    public int iNo1;
    public int iNo2;

    public Demo()
    {
        System.out.println("Inside default constructor");
    }
    public Demo(int i, int j)
    {
        System.out.println("Inside parameterised constructor");
    }
}

class Constructor
{
    public static void main(String arr[])
    {
        Demo dobj1 = new Demo();        // Demo dobj1();
        Demo dobj2 = new Demo(11, 21);  // Demo dobj2(11,21);
    }
}
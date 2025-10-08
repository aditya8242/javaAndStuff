class Demo
{
    public int i;               // instance variable
    static public int j;   // static variable

    static
    {
        System.out.println("Inside static block");
        j = 21;
    }

    public Demo()
    {
        System.out.println("Inside constructor");
        this.i = 11;
    }
}

class Blocks
{
    public static void main(String A[])
    {
        System.out.println("Inside main");
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        Demo dobj3 = new Demo();
    }
}
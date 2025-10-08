class Demo
{
    public int i;
    public static int j;

    static
    {
        j = 21;
    }

    public Demo()
    {
        this.i = 11; // first use
        System.out.println("Inside default");
    }

    public Demo(int a)
    {
        this(); // second use
        System.out.println("Inside parameterised");
        // this(); // write this at start
    }

    public void Display()
    {
        System.out.println("Inside display"+this.i); // third use
    }
}

class ThisDemo
{
    public static void main(String A[])
    {
        Demo dobj = new Demo(51);
        dobj.Display();
    }
}
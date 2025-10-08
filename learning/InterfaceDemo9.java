interface A
{
    int no = 11;
    void fun();
    
    private void Display()
    {
        System.out.println("Inside private display");
    }
    
    default void gun()
    {
        System.out.println("Inside gun");
        Display();
    }
}

class Demo implements A// multiple inheritance
{
    public void fun()
    {
        System.out.println("Inside fun");
    }
}

class InterfaceDemo9
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.fun();
        dobj.gun();
        // dobj.Display(); // error
    }
}
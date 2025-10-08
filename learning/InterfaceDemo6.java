interface A
{
    int no = 11;
    void fun();
}

interface B
{
    int no = 21;
    void fun();
}

class Demo implements A, B // multiple inheritance
{
    public void fun()
    {
        System.out.println("Inside fun" + no); // no generates error
    }
}

class InterfaceDemo6
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.fun();
    }
}
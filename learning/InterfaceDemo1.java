interface Demo
{
    int no = 11;
    void Display();
}

class Hello implements Demo
{
    // Error
}

class InterfaceDemo1
{
    public static void main(String A[])
    {
        Hello hobj = new Hello();
    }
}
class Base
{
    public int i, j;
}

class Derived extends Base
{
    public int x;
}

class RMDDemo1
{
    public static void main(String A[])
    {
        Base bp1 = new Base(); // no casting
        Derived dp1 = new Derived(); // no casting
        Base bp2 = new Derived(); // upcasting
        Derived dp2 = new Base(); // downcasting    // error
    }
}
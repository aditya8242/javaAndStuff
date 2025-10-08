class Demo
{
    public int i;
    final public int j;

    public Demo(int a, int b)
    {
        this.i = a;
        this.j = b;
    }
}

class FinalData4
{
    public static void main(String A[])
    {
        Demo dobj = new Demo(11, 21);

        System.out.println(dobj.i);
        System.out.println(dobj.j);

        dobj.i++;
        // dobj.j++; // error
    }
}
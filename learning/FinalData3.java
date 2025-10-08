class Demo
{
    public int i = 11;
    final public int j = 21;

    public Demo()
    {
        this.i = 12;
        this.j = 22;
    }
}

class FinalData3
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();

        System.out.println(dobj.i);
        System.out.println(dobj.j);

        dobj.i++;
        // dobj.j++; // error
    }
}
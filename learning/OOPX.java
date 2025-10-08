class Arithematic
{
    public int iNo1;
    public int iNo2;

    public Arithematic()
    {
        this.iNo1 = 0;
        this.iNo2 = 0;
    }
    public Arithematic(int i, int j)
    {
        this.iNo1 = i;
        this.iNo2 = j;        
    }

    public int Addition()
    {
        int iAns = 0;
        iAns = this.iNo1 + this.iNo2;
        return iAns;
    }
    public int Substraction()
    {
        int iAns = 0;
        iAns = this.iNo1 - this.iNo2;
        return iAns;
    }
}

class OOPX
{
    public static void main(String arr[])
    {
        Arithematic aobj1 = new Arithematic(11, 10);
        int iRet = 0;

        iRet = aobj1.Addition();
        System.out.println("Addition is "+iRet);

        iRet = aobj1.Substraction();
        System.out.println("Substraction is "+iRet);

        aobj1 = null;
    }
}
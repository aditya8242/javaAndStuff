class Demo
{

}

class ObjectClass1
{
	public static void main(String A[])
	{
		Demo dobj = new Demo();
		System.out.println(dobj.hashCode());
		System.out.println(dobj.getClass());
	}
}
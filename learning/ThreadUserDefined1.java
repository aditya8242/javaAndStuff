class Demo extends Thread
{
	public void run()
	{
		System.out.println("Inside run method");
	}
}

class ThreadUserDefined1
{
	public static void main(String A[])
	{
		Demo dobj1 = new Demo();
		dobj1.start();
	}
}
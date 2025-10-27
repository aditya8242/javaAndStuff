// code to demonstrate thread scheduling
class Demo extends Thread
{
	public void run()
	{
		int i = 0;
		for(i = 1; i <= 5; i++)
		{
			System.out.println("Inside run method of : " + Thread.currentThread().getName());
		}
	}
}

class ThreadUserDefinedSleep
{
	public static void main(String A[])
	{
		Demo dobj1 = new Demo();
		Demo dobj2 = new Demo();

		dobj1.setName("First");
		dobj2.setName("Second");

		System.out.println("Inside main thread");
		
		try
		{
			dobj1.start();
			dobj2.start();

			dobj1.join();
			dobj2.join();
		}
		catch(InterruptedException iobj)
		{

		}
		System.out.println("End of main thread");
	}
}
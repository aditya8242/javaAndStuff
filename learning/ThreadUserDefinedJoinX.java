class Demo extends Thread
{
	public void run()
	{
		System.out.println("Inside run method of : " + Thread.currentThread().getName());
	}
}

class ThreadUserDefinedJoinX
{
	public static void main(String A[]) throws InterruptedException
	{
		Demo dobj1 = new Demo();
		Demo dobj2 = new Demo();

		dobj1.setName("First");
		dobj2.setName("Second");

		System.out.println("Inside main thread");
		dobj1.start();
		dobj2.start();

		dobj1.join();
		dobj2.join();

		System.out.println("End of main thread");
	}
}
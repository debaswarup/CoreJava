package Threading;

public class SleepInterruptTest 
{

	public static void main(String[] args) throws InterruptedException
	{
		Thread1 t1 = new Thread1();
		t1.start();
		
		Thread.sleep(7000);
		
		t1.interrupt();
	}
	
	static class Thread1 extends Thread
	{
		@Override
		public void run()
		{
			try
			{
				while(true)
				{
					System.out.println(Thread.currentThread() + ": I am sleeping...");
					Thread.sleep(5000);
					System.out.println(Thread.currentThread() + ": I am running...");
				}
			}
			catch(InterruptedException ie)
			{
				System.out.println(Thread.currentThread() + ": I am interrupted." + Thread.interrupted());
			}
		}
	}
	
	
}

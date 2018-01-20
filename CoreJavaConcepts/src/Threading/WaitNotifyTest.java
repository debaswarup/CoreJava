package Threading;

/**
 * This program depicts the locks on different object problem
 * @author sush
 *
 */
public class WaitNotifyTest 
{

	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new MyThread1());
		Thread t2 = new Thread(new MyThread2());
		
		System.out.println("starting main..");
		t1.start();
		
		System.out.println("Main will sleep now..");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main will continue..");
		t2.start();
		System.out.println("Finishing main..");
	}

}

class MyThread1 implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("MyThread1 is starting..");
		synchronized(this) //synchronize without any parameter is not valid
		{
			try {
				System.out.println("MyThread1 will wait..");
				wait();
				System.out.println("MyThread1 continue..");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread2 implements Runnable
{

	@Override
	public void run() 
	{
		synchronized (this) 
		{
			System.out.println("MyThread2 is starting..");
			notify();
		}
	}
	
}
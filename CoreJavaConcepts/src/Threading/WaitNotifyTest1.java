package Threading;

/**
 * This program depicts the locks on same object to show basic wait/notify technique
 * @author sush
 *
 */
public class WaitNotifyTest1
{
	
	public static void main(String[] args) 
	{
		WaitNotifyTest1 wnt1 = new WaitNotifyTest1();
		Thread t1 = new Thread(new MyThread1(wnt1));
		Thread t2 = new Thread(new MyThread2(wnt1));
		
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

	static class MyThread1 implements Runnable
	{
		WaitNotifyTest1 _lockObj;
		MyThread1(WaitNotifyTest1 lockObj_)
		{
			_lockObj = lockObj_;
		}
		
		@Override
		public void run() 
		{
			System.out.println("MyThread1 is starting..");
			synchronized(_lockObj) //synchronize without any parameter is not valid
			{
				try {
					System.out.println("MyThread1 will wait..");
					_lockObj.wait();
					System.out.println("MyThread1 continue..");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	static class MyThread2 implements Runnable
	{

		WaitNotifyTest1 _lockObj;
		MyThread2(WaitNotifyTest1 lockObj_)
		{
			_lockObj = lockObj_;
		}
		
		@Override
		public void run() 
		{
			System.out.println("MyThread2 is starting..");
			synchronized (_lockObj) 
			{
				_lockObj.notify();
			}
			System.out.println("MyThread2 finishing..");
		}
		
	}

}



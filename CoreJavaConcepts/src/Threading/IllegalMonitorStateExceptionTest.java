package Threading;

public class IllegalMonitorStateExceptionTest {
	
	static Integer s = 2;
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new TestThread());
		t1.start();
	}
	
	static class TestThread implements Runnable
	{
		@Override
		public void run() {
			try
			{
				//If we dont synchronize on the object we will be waiting on, then it will throw IllegalMonitorStateException
				synchronized(s)
				{
					this.wait(5000);
					System.out.println("wait over");
				}
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	}

}

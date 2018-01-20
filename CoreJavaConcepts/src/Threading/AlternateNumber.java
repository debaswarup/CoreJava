package Threading;

public class AlternateNumber {

	static Integer counter = 1;
	static String lock = "";
	public static void main(String[] args) {
		
		Thread oddThread = new Thread(new OddNumber());
		Thread evenThread = new Thread(new EvenNumber());
		
		oddThread.start();
		evenThread.start();

	}

	static class OddNumber implements Runnable
	{
		@Override
		public void run() 
		{
			while(true)
			{
				synchronized(lock)
				{
					try {
						if(counter > 1)
							lock.wait(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(counter++ + Thread.currentThread().getName());

					lock.notify();

					if(counter > 10)
						break;
				}
			}
		}
	}
	
	static class EvenNumber implements Runnable
	{
		@Override
		public void run() 
		{
			while(true)
			{
				synchronized(lock)
				{
					try {
							lock.wait(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(counter++ + Thread.currentThread().getName());

					lock.notify();

					if(counter > 10)
						break;
				}
			}			
		}
	}
	
}

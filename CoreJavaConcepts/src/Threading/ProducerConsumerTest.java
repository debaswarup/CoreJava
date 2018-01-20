package Threading;

import java.util.ArrayList;
import java.util.List;

import Threading.ProducerConsumerTest.Producer.Consumer;

public class ProducerConsumerTest {

	static List<Integer> sharedList = new ArrayList<Integer>();
	static int capacity = 10;
	
	public static void main(String[] args) {

		Producer p1 = new Producer();
		Consumer c1 = new Consumer();
		
		p1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Start Consume now..");
		c1.start();
		
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		p1.stop();
		c1.stop();
	}
	
	static class Producer extends Thread
	{
		@Override
		public void run() {
			//super.run();
			
			int count= 0;
			while(true)
			{
				System.out.println("Starting to produce.." + count);
				
				synchronized (sharedList) {
					
					if(sharedList.size() >= capacity)
					{
						try {
							sharedList.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					sharedList.add(count++);
					sharedList.notify();
				}
				
				System.out.println("Finished produce.." + count);
			}
		}
		
		static class Consumer extends Thread
		{
			@Override
			public void run() {
				//super.run();
				
				while(true)
				{
					System.out.println("Starting to consume..");
					synchronized (sharedList) {
						if(sharedList.size()<=0)
						{
							try {
								sharedList.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						System.out.println("Removed " + sharedList.remove(0));
						sharedList.notify();
					}
				}
			}
		}
	}

}

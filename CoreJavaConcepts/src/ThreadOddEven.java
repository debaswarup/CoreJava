import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ThreadOddEven implements Runnable
{
	final static String ODD_THREAD_NAME = "OddThread";
	final static String EVEN_THREAD_NAME = "EvenThread";
	List<Integer> numberList = new ArrayList<Integer>();
	Object lockObj = new Object();
	
	public static void main(String[] args) 
	{
		ThreadOddEven toe = new ThreadOddEven();
		toe.numberList = Arrays.asList(1,2,3,4,5,6);
		
		Thread tOdd = new Thread(toe);
		tOdd.setName(ODD_THREAD_NAME);
		Thread tEven = new Thread(toe);
		tEven.setName(EVEN_THREAD_NAME);
		
		tOdd.start();
		tEven.start();
	}

	public void run() 
	{		
			for(int a: numberList)
			{
				synchronized(ThreadOddEven.class)
				{
					if(Thread.currentThread().getName().equals(ODD_THREAD_NAME) && a % 2 != 0)
					{
						System.out.println("Odd Number:" + a);
						try 
						{
							lockObj.wait();
						} 
						catch (InterruptedException e) 
						{
							e.printStackTrace();
						}
					}
					else if(Thread.currentThread().getName().equals(EVEN_THREAD_NAME) && a % 2 == 0)
					{
						System.out.println("Even Number:" + a);
						try 
						{
							lockObj.notify();
						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
					}
				}
			}
	}
}



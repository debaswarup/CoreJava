import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class StringIntern {
	
	public static void main(String[] args) {
		
		String s1 = "test111";
		String s4 = "test222";
		String s2 = new String("test111");
		String s3 = s2.intern();
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3);
		BlockingQueue<String> q = new ArrayBlockingQueue<String>(5000);
		
		s4 = null;
		System.out.println(s1.equals(s3));
		
		
	}

}

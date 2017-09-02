import java.util.ArrayList;
import java.util.List;


public class PassByValueTest 
{
	
	static class PassByValueChild
	{
		int a = 4;
	}

	public static void main(String[] args) 
	{
		PassByValueChild p = new PassByValueChild();
		p.a = 7;
		test11(p);
		System.out.println(p.a);
		List<Integer> l1= new ArrayList<Integer>();
		test11(l1);
		System.out.println(l1.get(0));
	}
	
	private static void test11(PassByValueChild p1)
	{
		p1 = new PassByValueChild();
		p1.a = 9;
	}
	
	private static void test11(List<Integer> l2)
	{
		l2.add(5);
	}

}

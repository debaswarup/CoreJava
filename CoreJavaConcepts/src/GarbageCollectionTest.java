import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class GarbageCollectionTest {

	
	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<String>();
		String s1 = new String("Gopal");
		list1.add(s1);
		s1 = new String("Ram");
		System.out.println(list1.get(0));
		
		Set<String> set1 =new HashSet<String>();
		set1.add(new String("Shyam"));
		set1.add("Shyam");
		System.out.println(set1.size());
	}
	
}

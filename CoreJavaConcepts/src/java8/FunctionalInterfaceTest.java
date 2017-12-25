package java8;

import java.util.Arrays;
import java.util.List;

public class FunctionalInterfaceTest 
{
	public static void main(String[] args) 
	{
		//doAdd(() -> System.out.println("test222"));
		List<String> names = Arrays.asList("Ram", "Shyam", "Gopal");
		/*names.stream().forEach(
				n -> System.out.println();
				
				);*/
		
	}
	
	public static void doAdd(MyFuncInterface fi)
	{
		fi.add();
	}
}


@FunctionalInterface
interface MyFuncInterface
{
	public void add();
	
}
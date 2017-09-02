import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



public class ReflectionTest {
	
	public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, ClassNotFoundException, InstantiationException, IllegalAccessException 
	{
			Class class1 = Class.forName("Reflect1");
			Reflect1 inst = (Reflect1)class1.newInstance();
			System.out.println(inst.i);
			
			Object inst2 = (Reflect1)class1.newInstance();
			Method[] methods = class1.getDeclaredMethods();			
			for(Method method : methods)
			{
				if(method.getName().equals("reflectedMethod"))
				{
					method.setAccessible(true);
					method.invoke(inst2);
				}
			}
			
			class1.getMethod("reflectedMethod1", null).invoke(inst2);
	}
}

class Reflect1
{
	int i = 9;
	
	private Reflect1()
	{
		System.out.println("const called");
	}
	
	private void reflectedMethod()
	{
		System.out.println("reflectedMethod called");
	}
	
	public void reflectedMethod1()
	{
		System.out.println("reflectedMethod1 called");
	}
}

public class Employee1 implements Cloneable {
	
	String name;
	int rollNum;
	
	private Employee1(String name_, int rollNum_)
	{
		name = name_;
		rollNum= rollNum_;
		System.out.println("Inside employee constructor");
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
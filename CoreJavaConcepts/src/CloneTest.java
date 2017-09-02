
public class CloneTest 
{
	public static void main(String[] args) 
	{
		Root r1 = new Root(6);
		try {
			Root r2= (Root)r1.clone();
			r1.i = 5;
			System.out.println(r2.i);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
}

class Root implements Cloneable
{
	public int i = 3;
	
	public Root(int i1)
	{
		i = i1;
		System.out.println("contructor1 called");
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

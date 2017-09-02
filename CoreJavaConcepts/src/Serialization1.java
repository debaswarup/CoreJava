import java.io.Serializable;


public class Serialization1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public int i = 10;
	
	public Serialization1()
	{
		System.out.println("const called");
	}
}

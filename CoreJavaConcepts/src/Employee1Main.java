
public class Employee1Main
{
	public static void main(String[] args) throws CloneNotSupportedException{
		Employee1 e1 = null; //= new Employee1("Suraj", 1);
		
		//Clone doesnt access constructor
		Employee1 e2 = (Employee1) e1.clone();
		
		
	}
}

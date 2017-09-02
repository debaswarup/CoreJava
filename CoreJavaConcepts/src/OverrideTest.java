
public class OverrideTest {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.count);
		p.display();
		p.print();
		p.modifyCount1();
		System.out.println(p.count1);
	}
	
}

class Parent
{
	int count = 4;
	
	void display()
	{
		System.out.println("Parent method");
	}
	
	static void print()
	{
		System.out.println("Parent Print method");
	}
	
	int count1 = 8;
	
	void modifyCount1()
	{
		count1 = 9;
	}
}

class Child extends Parent
{
	int count = 5;
	int count1;
	
	void display()
	{
		System.out.println("Child method");
	}
	
	static void print()
	{
		System.out.println("Child Print method");
	}
	
	void modifyCount1()
	{
		count1 = 10;
		//System.out.println(count);
	}
}
